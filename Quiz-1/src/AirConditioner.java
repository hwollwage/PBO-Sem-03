public class AirConditioner {
    private String brand;
    private int year;
    private Compressor compressor;
    private Remote remote;

    public AirConditioner(String brand, int year, Compressor compressor, Remote remote) {
        this.brand = brand;
        this.year = year;
        this.compressor = compressor;
        this.remote = remote;
    }

    public void setBrand(String brand) {this.brand = brand;}
    public void setYear(int year) {this.year = year;}

    public String getBrand() {return brand;}
    public int getYear() {return year; }
    public Compressor getCompressor() {return compressor;}
    public Remote getRemoteAC() {return remote;}
}
