package ads.poo;

public enum SistemaSolar {
    MERCURIO(0),
    VENUS(1),
    TERRA(2),
    MARTE(3),
    JUPITER(4),
    SATURNO(5),
    URANO(6),
    NETUNO(7);

    private int codigo;

    SistemaSolar(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
}
