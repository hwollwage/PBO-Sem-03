public class TestMahasiswa {
    public static void main(String[] args) {
        Jurusan jur = new Jurusan();
        jur.setName("Teknologi Informasi");
        jur.setAccreditation("A");

        Mahasiswa mhs = new Mahasiswa("111001", "Jones", jur);
        mhs.tampilkanInfo();
    }
}
