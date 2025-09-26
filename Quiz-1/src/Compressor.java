public class Compressor {
    private String type;
    private int capacity;

    public Compressor(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void setType(String type) {this.type = type;}
    public void setCapacity(int capacity) {this.capacity = capacity;} 

    public String getType() {return type;}
    public int getCapacity() {return capacity;}
}
