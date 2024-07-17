package heritage;

public class Villager extends Character{

    public Villager() {
        super(25, 1, 0.8, "Pickaxe", 1);
    }

    public void plant() {
        System.out.println("Você plantou");
    }

    public void harvest() {
        System.out.println("Você colheu");
    }

    @Override
    public void attack() {
        System.out.println("Aldeão está atacando com a " + typeGun);
    }

    @Override
    public void walk() {
        System.out.println("Aldeão está andando na velocidade " + movimentSpeed);
    }
}
