package backend;

import java.sql.*;
import java.util.ArrayList;

public class Category implements ICRUD {

    private int id;
    private String name;

    public Category() {

    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean insert() {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "INSERT INTO categories(name) VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
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
            String sql = "UPDATE categories SET name=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, id);
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
            String sql = "DELETE FROM categories WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Category> getAll() {
        ArrayList<Category> list = new ArrayList<>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "SELECT * FROM categories";
            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {
                list.add(new Category(rs.getInt("id"), rs.getString("name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
