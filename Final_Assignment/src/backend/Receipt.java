package backend;

import java.sql.*;
import java.util.ArrayList;

public class Receipt implements ICRUD {

    private int id;
    private Customer customer;
    private double total;
    private ArrayList<ReceiptItem> items = new ArrayList<>();

    public Receipt() {

    }

    public Receipt(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<ReceiptItem> getItems() {
        return items;
    }

    // add item to receipt
    public void addItem(ReceiptItem item) {
        this.items.add(item);
    }

    // calculate total from items  
    public void calculateTotal() {
        double sum = 0;
        for (ReceiptItem item : items) {
            sum += item.getSubtotal();
        }
        this.total = sum;
    }

    // insert receipt + item (transac)
    @Override
    public boolean insert() {
        Connection conn = DBHelper.getConnection();
        PreparedStatement pst;
        ResultSet rs;

        try {
            // insert receipt
            String sql = "INSERT INTO receipts(customer_id, total) VALUES (?,?)";
            pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, customer.getId());
            pst.setDouble(2, total);
            pst.executeUpdate();

            // get gnerated receipt id
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                this.id = rs.getInt(1);
            }

            // insert each receipt item
            for (ReceiptItem item : items) {
                item.setReceipt(this);
                item.insert();
            }

            return true;

        } catch (SQLException e) {
            System.out.println("Insert Receipt Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update() {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "UPDATE receipts SET customer_id=?, total=? WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, customer.getId());
            pst.setDouble(2, total);
            pst.setInt(3, id);
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Update Receipt Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete() {
        try {
            Connection conn = DBHelper.getConnection();

            // delete item first (FK)
            String sqlItems = "DELETE FROM receipt_items WHERE receipt_id=?";
            PreparedStatement pst1 = conn.prepareStatement(sqlItems);
            pst1.setInt(1, id);
            pst1.executeUpdate();

            // del receipt
            String sql = "DELETE FROM receipts WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println("Delete Receipt Error: " + e.getMessage());
            return false;
        }
    }

    // list rceipt (join cust)
    public static ArrayList<Receipt> getAll() {
        ArrayList<Receipt> list = new ArrayList<>();
        Connection conn = DBHelper.getConnection();

        try {
            String sql = """
                SELECT r.id AS rid, r.total, c.id AS cid, c.name AS cname, c.phone
                FROM receipts r
                JOIN customers c ON r.customer_id = c.id
            """;

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt("cid"));
                c.setName(rs.getString("cname"));
                c.setPhone(rs.getString("phone"));

                Receipt r = new Receipt(c);
                r.setId(rs.getInt("rid"));
                r.setTotal(rs.getDouble("total"));

                list.add(r);
            }

        } catch (SQLException e) {
            System.out.println("Get Receipts Error: " + e.getMessage());
        }

        return list;
    }
}
