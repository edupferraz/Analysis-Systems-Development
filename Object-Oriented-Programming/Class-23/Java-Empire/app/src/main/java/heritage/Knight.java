package heritage;

public class Knight extends Character{
    public Knight() {
        super(50, 3, 2, "Sword", 1);
    }


    public void lunge() {
        System.out.println("Você deu uma estocada");
    }

    public void harvest() {
        System.out.println("Você pode atacar em movimento por 5 segundos");
    }

    @Override
    public void attack() {
        System.out.println("Cavaleiro está atacando com a " + typeGun);
    }

    @Override
    public void walk() {
        System.out.println("Cavaleiro está andando na velocidade " + movimentSpeed);
    }
}
