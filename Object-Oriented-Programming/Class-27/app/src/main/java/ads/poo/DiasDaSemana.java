package ads.poo;

public enum DiasDaSemana {

    DOM(0, "segunda-feira"),
    SEG(1, "terça-feira" ),
    TER(2, "quarta-feira" ),
    QUA(3, "quinta-feira"),
    QUI(4, "sexta-feira"),
    SEX(5, "sábado"),
    SAB(6, "domingo");

    private int codigo;
    private String texto;

    DiasDaSemana(int codigo, String text) {
        this.codigo = codigo;
        this.texto = texto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTexto() {
        return texto;
    }

    public String toString() {
        return texto;
    }
}
