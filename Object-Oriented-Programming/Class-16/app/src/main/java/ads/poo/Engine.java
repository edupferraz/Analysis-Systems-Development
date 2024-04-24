package ads.poo;

public class Engine {
    private int hp;
    private int cylinder;

    public Engine(int hp, int cylinder) {
        this.hp = hp;
        this.cylinder = cylinder;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
}
