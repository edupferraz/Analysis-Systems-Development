package ads.poo;

public class Phone {
    private String label;
    private String value;

    public Phone(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Label: ");
        sb.append(this.label);
        sb.append("Value: ");
        sb.append(this.value);

        return sb.toString();
    }
}
