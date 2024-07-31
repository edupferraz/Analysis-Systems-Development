package ads.poo;

public enum Cartas {
    ÁS(1, "A"),
    DOIS(2, "2"),
    TRES(3, "3"),
    QUATRO(4, "4"),
    CINCO(5, "5"),
    SEIS(6, "6"),
    SETE(7, "7"),
    OITO(8, "8"),
    NOVE(9, "9"),
    DEZ(10, "10"),
    VALETE(11, "J"),
    DAMA(12, "Q"),
    REI(13, "K");
    private int codigo;
    private String nome;

    Cartas(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
