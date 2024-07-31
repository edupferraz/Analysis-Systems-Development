package ads.poo;

public enum Naipes {

    PAUS(0, "Paus"),
    OUROS(1, "Ouros"),
    COPA(2, "Copas"),
    ESPADA(3, "Espadas");
    private int codigo;
    private String nome;

    Naipes(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
