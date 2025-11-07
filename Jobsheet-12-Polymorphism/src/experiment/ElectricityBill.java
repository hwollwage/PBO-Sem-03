package experiment;

public class ElectricityBill implements Payable {
    private int kwh;
    private String catergory;

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.catergory = category;
    }
    public int getKwh() {
        return kwh;
    }
    public void setKwh(int kwh) {
        this.kwh = kwh;
    }
    public String getCategory() {
        return catergory;
    }
    public void setCategory(String category) {
        this.catergory = category;
    }
    public int getPaymentAmount() {
        return kwh*getBasePrice();
    }
    public int getBasePrice() {
        int bPrice = 0;
        switch(catergory) {
            case "R-1": bPrice = 100; break;
            case "R-2": bPrice = 200; break;
        }
        return bPrice;
    }
    public String getBillInfo() {
        return "KWH = "+kwh+"\n"+
                "Category = "+catergory+" ("+getBasePrice()+" per KWH)\n";
    }
}
