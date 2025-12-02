package backend;

import java.sql.*;

public class DBHelper {

    private static Connection koneksi;

    public static void bukaKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "root";
                String password = "";

                Class.forName("com.mysql.cj.jdbc.Driver");

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil!");
            } catch (Exception e) {
                System.out.println("Error koneksi!");
                e.printStackTrace();
            }
        }
    }

    public static int insertQueryGetId(String query) {
        bukaKoneksi();
        int generatedId = -1;

        try (Statement stmt = koneksi.createStatement()) {

            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                generatedId = rs.getInt(1);
            }

            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return generatedId;
    }

    public static boolean executeQuery(String query) {
        bukaKoneksi();
        boolean success = false;

        try (Statement stmt = koneksi.createStatement()) {

            stmt.executeUpdate(query);
            success = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    public static ResultSet selectQuery(String query) {
        bukaKoneksi();

        try {
            Statement stmt = koneksi.createStatement();
            return stmt.executeQuery(query);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
