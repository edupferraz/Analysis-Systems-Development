package ads.poo;

public class Carta {
    private Cartas number;
    private Naipes naipe;

    public Carta(Cartas number, Naipes naipe) {
        this.number = number;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return  number + " de " + naipe;
    }
}
