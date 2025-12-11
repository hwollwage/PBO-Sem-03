package backend;

import java.sql.*;
import java.util.ArrayList;

public class Medicine implements ICRUD {

    private int id;
    private String name;
    private double price;
    private int stock;

    private Category category;   // join relation

    public Medicine() {
    }

    public Medicine(int id, String name, double price, int stock, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean insert() {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "INSERT INTO medicines(name,price,stock,category_id) VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, stock);
            ps.setInt(4, category.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update() {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "UPDATE medicines SET name=?, price=?, stock=?, category_id=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, stock);
            ps.setInt(4, category.getId());
            ps.setInt(5, id);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete() {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "DELETE FROM medicines WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // select join
    public static ArrayList<Medicine> getAll() {
        ArrayList<Medicine> list = new ArrayList<>();

        try {
            Connection conn = DBHelper.getConnection();
            String sql = """
                SELECT m.*, c.id AS cid, c.name AS cname
                FROM medicines m
                JOIN categories c ON m.category_id = c.id
            """;

            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {

                Category cat = new Category(rs.getInt("cid"), rs.getString("cname"));
                Medicine med = new Medicine(rs.getInt("id"), rs.getString("name"), rs.getDouble("price"), rs.getInt("stock"), cat);
                list.add(med);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
