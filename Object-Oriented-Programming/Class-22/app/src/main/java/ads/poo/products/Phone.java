package ads.poo.products;

public class Phone {
    private int code;
    private String numSerie;
    private String model;
    protected float weight;
    private Dimension dimension;

    public Phone(int code, String numSerie, String model, float weight, Dimension dimension) {
        this.code = code;
        this.numSerie = numSerie;
        this.model = model;
        this.weight = weight;
        this.dimension = dimension;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Phone{" +
                ", code=" + code +
                ", numSerie='" + numSerie + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", dimension=" + dimension +
                '}';
    }
}
