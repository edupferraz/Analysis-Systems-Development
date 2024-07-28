package gamecar;

public abstract class Veiculo {

    protected int id;
    protected int velocidadeAtual;
    protected boolean temTracaoIntegral = false;
    protected int maxVelocidade = 140;

    public int acelerar(int i ) {
        velocidadeAtual += i;
        return velocidadeAtual;
    }

    public int frear(int i ) {
        velocidadeAtual -= i;
        return velocidadeAtual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {

        if (temTracaoIntegral = true) {
            maxVelocidade = 200;
        }

        if (velocidadeAtual <= maxVelocidade) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            this.velocidadeAtual = maxVelocidade;
        }
    }

    public boolean isTemTracaoIntegral() {
        return temTracaoIntegral;
    }

    public void setTemTracaoIntegral(boolean temTracaoIntegral) {
        this.temTracaoIntegral = temTracaoIntegral;
    }

    public int getMaxVelocidadeAtual() {
        return maxVelocidade;
    }

    public void setMaxVelocidade(int maxVelocidadeAtual) {
        this.maxVelocidade = maxVelocidadeAtual;
    }

}
