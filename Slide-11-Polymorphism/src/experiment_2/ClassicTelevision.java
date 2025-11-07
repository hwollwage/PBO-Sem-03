package experiment_2;

public class ClassicTelevision extends Electronics {
    private String inputMode;

    public ClassicTelevision() {
        super();
        inputMode = "DUI";
    }

    public String getInputMode() {
        return inputMode;
    }
}
