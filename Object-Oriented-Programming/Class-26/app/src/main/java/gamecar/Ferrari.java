package gamecar;

public class Ferrari extends Veiculo implements Conversivel{
    private boolean farol;
    private boolean capota;

    public boolean abrirFecharCapota() {
        capota = !capota;
        return capota;
    }

    public boolean ligarDesligarFarol() {
        farol = !farol;
        return farol;
    }
}
