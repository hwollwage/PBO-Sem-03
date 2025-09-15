public class Mahasiswa {
    private String nim;
    private String name;
    private Jurusan jur;

    public Mahasiswa(String nim, String name, Jurusan jur) {
        this.nim = nim;
        this.name = name;
        this.jur = jur;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJur(Jurusan jur) {
        this.jur = jur;
    }

    public Jurusan getJur() {
        return jur;
    }
    
    public void tampilkanInfo() {
        System.out.println("Student ID : "+nim);
        System.out.println("Student Name : "+name);
        jur.tampilkanInfo();
    }
}
