package ads.poo;
import java.util.Random;
public class Buzz {
    private boolean helmetIsOpen = false;
    private boolean wingsIsOpen = false;
    private String[] quotes = {
        "Isto não é voar. Isto é cair, com estilo!",
        "Ao infinito e além!",
        "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!",
        "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.",
        "Eu sou o Buzz Lightyear",
        "Comando Estelar pronto pra voar!"
    };

    public boolean getHelmet() {
        return helmetIsOpen;
    }
    public boolean setHelmet() {

        helmetIsOpen = !helmetIsOpen;

        return helmetIsOpen;
    }
    public boolean getWings() {

        return wingsIsOpen;
    }
    public boolean setWings() {

        wingsIsOpen = !wingsIsOpen;

        return wingsIsOpen;
    }
    public String sayQuote() {
        Random r = new Random();
        return quotes[r.nextInt(6)];
    }
    public String startLaser() {

        return "Disparando laser";
    }
    public String startScam() {

        return "Golpeando";
    }


}
