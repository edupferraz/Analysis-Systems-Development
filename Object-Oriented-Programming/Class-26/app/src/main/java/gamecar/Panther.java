package gamecar;

public class Panther extends Veiculo implements TracaoIntegral, VeiculoAnfibio, Conversivel{
    private int temperaturaGeladeira;
    private boolean capota;
    private boolean tracao;
    private boolean rodas;
    private boolean lastro;

    public int alterarTemperatura(int novaTemperatura) {
        temperaturaGeladeira = novaTemperatura;
        return temperaturaGeladeira;
    }

    public boolean abrirFecharCapota() {
        capota = !capota;
        return capota;
    }

    public boolean ativarDesativarTracao() {
        tracao = !tracao;
        return tracao;
    }

    public String esvaziarLastro() {
        return "Lastro esvaziado";
    }


    @Override
    public boolean abrirRecolherRodas() {
        return false;
    }
}
