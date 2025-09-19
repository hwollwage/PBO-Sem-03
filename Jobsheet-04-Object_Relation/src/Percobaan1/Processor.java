package Percobaan1;
public class Processor {
    private String merk;
    private double cache;

    Processor() {

    }

    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public double getCache() {
        return cache;
    }
    
    public void info() {
        System.out.println("Merk processor : "+merk);
        System.out.printf("Cache memory : %.2f\n", cache);
    }
}

