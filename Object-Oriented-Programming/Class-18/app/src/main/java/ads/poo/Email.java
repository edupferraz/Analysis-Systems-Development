package ads.poo;

public class Email {
    private String label;
    private String value;

    public Email(String label, String value) {
        this.label = label;
        this.value = setValue(value);
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

    public String setValue(String value) {

        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

        if (!value.matches(eR)) {
            this.value = "";
        } else {
            this.value = value;
        }

        return this.value;
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
