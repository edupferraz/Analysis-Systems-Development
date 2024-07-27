package gamecar;

public abstract class Veiculo {

    protected int id;
    protected int velocidadeAtual;

    public int acelerar(int i ) {
        velocidadeAtual += i;
        return velocidadeAtual;
    }

    public int frear(int i ) {
        velocidadeAtual -= i;
        return velocidadeAtual;
    }
}
