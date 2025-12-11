package backend;

import java.sql.*;
import java.util.ArrayList;

public class Customer implements ICRUD {

    private int id;
    private String name;
    private String phone;

    public Customer() {
    }

    public Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean insert() {
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "INSERT INTO customers(name,phone) VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
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
            String sql = "UPDATE customers SET name=?, phone=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setInt(3, id);
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
            String sql = "DELETE FROM customers WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<Customer> getAll() {
        ArrayList<Customer> list = new ArrayList<>();
        try {
            Connection conn = DBHelper.getConnection();
            String sql = "SELECT * FROM customers";
            ResultSet rs = conn.createStatement().executeQuery(sql);

            while (rs.next()) {
                list.add(new Customer(rs.getInt("id"),rs.getString("name"),rs.getString("phone")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
