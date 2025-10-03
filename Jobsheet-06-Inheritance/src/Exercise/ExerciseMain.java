package Exercise;

public class ExerciseMain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("12334212", "Mr. Ridwan Rismanto, S.ST., M.Kom ", "Jl. Mawar 30", 200000);
        dosen1.setSKS(40);
        Dosen dosen2 = new Dosen("40594020", "Hanzel Wollwage", "Jl. Anggrek 12", 130000);
        dosen2.setSKS(19);

        DaftarGaji daftar = new DaftarGaji(5);

        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}
