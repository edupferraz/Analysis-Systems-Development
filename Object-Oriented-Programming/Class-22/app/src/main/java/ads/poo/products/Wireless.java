package ads.poo.products;

public class Wireless extends Phone{
    private float frequence;
    private int chanels;
    private float distance;

    public Wireless(int code, String numSerie, String model, float weight, Dimension dimension, float frequence, int chanels, float distance) {
        super(code, numSerie, model, weight, dimension);
        this.frequence = frequence;
        this.chanels = chanels;
        this.distance = distance;
    }

    public float getFrequence() {
        return frequence;
    }

    public void setFrequence(float frequence) {
        this.frequence = frequence;
    }

    public int getChanels() {
        return chanels;
    }

    public void setChanels(int chanels) {
        this.chanels = chanels;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return super.toString() + "frequence=" + frequence +
                ", chanels=" + chanels + "distance=" + distance + weight;
    }
}
