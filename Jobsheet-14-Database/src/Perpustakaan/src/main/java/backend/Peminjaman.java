package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Peminjaman {

    private int idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman() {}

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman pin = new Peminjaman();

        String sql = "SELECT * FROM peminjaman WHERE idpeminjaman = " + id;
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            if (rs.next()) {
                pin = new Peminjaman();
                pin.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pin.setAnggota(new Anggota().getById(rs.getInt("idanggota")));
                pin.setBuku(new Buku().getById(rs.getInt("idbuku")));
                pin.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pin.setTanggalKembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pin;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList<>();

        String sql = "SELECT * FROM peminjaman";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Peminjaman pin = new Peminjaman();
                pin.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pin.setAnggota(new Anggota().getById(rs.getInt("idanggota")));
                pin.setBuku(new Buku().getById(rs.getInt("idbuku")));
                pin.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pin.setTanggalKembali(rs.getString("tanggalkembali"));

                ListPeminjaman.add(pin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList<>();

        String sql = "SELECT * FROM peminjaman p "
                + "INNER JOIN anggota a ON p.idanggota = a.idanggota "
                + "INNER JOIN buku b ON p.idbuku = b.idbuku "
                + "WHERE a.nama LIKE '%" + keyword + "%' "
                + "OR b.judul LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Peminjaman pin = new Peminjaman();
                pin.setIdPeminjaman(rs.getInt("idpeminjaman"));
                pin.setAnggota(new Anggota().getById(rs.getInt("idanggota")));
                pin.setBuku(new Buku().getById(rs.getInt("idbuku")));
                pin.setTanggalPinjam(rs.getString("tanggalpinjam"));
                pin.setTanggalKembali(rs.getString("tanggalkembali"));

                ListPeminjaman.add(pin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public void save() {
        if (getById(idPeminjaman).getIdPeminjaman() == 0) {
            // INSERT
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + "'" + this.anggota.getIdAnggota() + "', "
                    + "'" + this.buku.getIdBuku() + "', "
                    + "'" + this.tanggalPinjam + "', "
                    + "'" + this.tanggalKembali + "'"
                    + ")";

            this.idPeminjaman = DBHelper.insertQueryGetId(SQL);

        } else {
            // UPDATE
            String SQL = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.anggota.getIdAnggota() + "', "
                    + "idbuku = '" + this.buku.getIdBuku() + "', "
                    + "tanggalpinjam = '" + this.tanggalPinjam + "', "
                    + "tanggalkembali = '" + this.tanggalKembali + "' "
                    + "WHERE idpeminjaman = '" + this.idPeminjaman + "'";

            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idPeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }

}
