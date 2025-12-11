package backend;

import java.sql.*;

public class ReceiptItem implements ICRUD {

    private int id;
    private Receipt receipt;
    private Medicine medicine;
    private int quantity;
    private double subtotal;

    public ReceiptItem() {
        
    }

    public ReceiptItem(Medicine med, int qty) {
        this.medicine = med;
        this.quantity = qty;
        this.subtotal = med.getPrice() * qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public boolean insert() {
        try {
            Connection conn = DBHelper.getConnection();

            String sql = "INSERT INTO receipt_items(receipt_id, medicine_id, quantity, subtotal) VALUES (?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, receipt.getId());
            pst.setInt(2, medicine.getId());
            pst.setInt(3, quantity);
            pst.setDouble(4, subtotal);

            pst.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Insert Item Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update() {
        try {
            Connection conn = DBHelper.getConnection();

            String sql = "UPDATE receipt_items SET medicine_id=?, quantity=?, subtotal=? WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, medicine.getId());
            pst.setInt(2, quantity);
            pst.setDouble(3, subtotal);
            pst.setInt(4, id);

            pst.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Update Item Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete() {
        try {
            Connection conn = DBHelper.getConnection();

            String sql = "DELETE FROM receipt_items WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Delete Item Error: " + e.getMessage());
            return false;
        }
    }
}
