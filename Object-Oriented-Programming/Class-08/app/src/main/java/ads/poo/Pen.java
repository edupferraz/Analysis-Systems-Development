package ads.poo;

public class Pen {

    // Atributo - -1 unidade de tinta
    private String color = "Preta";
    private int ink = 100;

    // Metodo

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getInk() {
        return ink;
    }

    public void setInk(int ink) {
        this.ink = ink;
    }

    public String draw() {
        if (ink != 0) {
            ink--;

            return "Está desenhando com a cor" + color + "...";
        } else {
            return "Sem tinta";
        }

    }

}
