package ads.poo.products;

public class Cellphone extends Phone{
    protected String operationalSystem;

    public Cellphone(int code, String numSerie, String model, float weight, Dimension dimension, String operationalSystem) {
        super(code, numSerie, model, weight, dimension);
        this.operationalSystem = operationalSystem;
    }

    public String getOperationalSystem() {
        return operationalSystem;
    }

    public void setOperationalSystem(String operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    @Override
    public String toString() {
        return super.toString() + ", operationalSystem=" + operationalSystem;
    }
}
