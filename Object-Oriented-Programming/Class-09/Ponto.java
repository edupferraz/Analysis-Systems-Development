public class Ponto {
    private int x, y;

    public Ponto(int i, int j) {
        //TODO Auto-generated constructor stub
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(int x, int y) {
        return "(" + x + "," + y + ")";
    }

    public double distancia(Ponto ponto) {
        return Math.sqrt(Math.pow(ponto.x - this.x, 2) + Math.pow(ponto.y - this.y, 2));
    }

}
