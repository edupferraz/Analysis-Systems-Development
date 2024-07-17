package heritage;

public class Character {
    protected int health;
    protected int powerAttack;
    protected double movimentSpeed;
    protected String typeGun;
    protected int levelGun = 1;

    public Character(int health, int powerAttack, double movimentSpeed, String typeGun, int levelGun) {
        this.health = health;
        this.powerAttack = powerAttack;
        this.movimentSpeed = movimentSpeed;
        this.typeGun = typeGun;
        this.levelGun = levelGun;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPowerAttack() {
        return powerAttack;
    }

    public void setPowerAttack(int powerAttack) {
        this.powerAttack = powerAttack;
    }

    public double getMovimentSpeed() {
        return movimentSpeed;
    }

    public void setMovimentSpeed(double movimentSpeed) {
        this.movimentSpeed = movimentSpeed;
    }

    public String getTypeGun() {
        return typeGun;
    }

    public void setTypeGun(String typeGun) {
        this.typeGun = typeGun;
    }

    public int getLevelGun() {
        return levelGun;
    }

    public void setLevelGun(int levelGun) {
        this.levelGun = levelGun;
    }

    public void attack() {
        System.out.println("Você atacou");
    }

    public void defense() {
        System.out.println("Você defendeu");
    }

    public void walk() {
        System.out.println("Você andou");
    }

    public void run() {
        System.out.println("Você correu");
    }

    @Override
    public String toString() {
        return "Character{" +
                "health=" + health +
                ", powerAttack=" + powerAttack +
                ", movimentSpeed=" + movimentSpeed +
                ", typeGun='" + typeGun + '\'' +
                ", levelGun=" + levelGun +
                '}';
    }
}
