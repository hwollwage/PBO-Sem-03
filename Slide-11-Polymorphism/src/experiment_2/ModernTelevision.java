package experiment_2;

public class ModernTelevision extends Electronics {
    private String inputMode;

    public ModernTelevision() {
        super();
        inputMode = "HDMI";
    }

    public String getInputMode() {
        return inputMode;
    }
}
