package heritage;

public class Archer extends Character{


    public Archer() {
        super(35, 2, 1, "Archery", 1);
    }

    public void rainArrows() {
        System.out.println("Você invocou a chuva de flechas");
    }

    public void fireArrow() {
        System.out.println("Você lançou uma flecha de fogo");
    }

    @Override
    public void attack() {
        System.out.println("Arqueiro está atacando com a " + typeGun);
    }

    @Override
    public void walk() {
        System.out.println("Arqueiro está andando na velocidade " + movimentSpeed);
    }
}
