package ads.poo;

import java.lang.reflect.Array;

public class Horario {
    private int hora = 0, minuto = 0, segundo = 0;
    String[] horaE = {"zero", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte"};
    String[] minutosE = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte", "trinta", "quarenta", "cinquenta"};
    String[] segundosE = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte", "trinta", "quarenta", "cinquenta"};


    public Horario(int hora , int minuto, int segundo) {

        if (horasValidas(hora) || minutosValidos(minuto) || segundosValidos(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if (horasValidas(hora)) {this.hora = hora; return true;} else {return false;}
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if (minutosValidos(minuto)) {this.minuto = minuto; return true;} else {return false;}
    }

    public int getSegundo() {
        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if (segundosValidos(segundo)) {this.segundo = segundo; return true;} else {return false;}
    }

    @Override
    public String toString() {
        return  hora + ":" + minuto + ":" + segundo;
    }

    public boolean horasValidas(int hora) {
        if(hora > 0 & hora < 23) {
           return true;
        } else {
            return false;
        }
    }

    public boolean minutosValidos(int minuto) {
        if(hora > 0 & hora < 23) {
            return true;
        } else {
            return false;
        }
    }
    public boolean segundosValidos(int segundo) {
        if(hora > 0 & hora < 23) {
            return true;
        } else {
            return false;
        }
    }

    public int[] converteExtenso(int unidade) {
        int[] retorno = {};

        if (unidade % 10 == 0 || unidade < 20) {
            retorno = new int[unidade];
        } else {
            int dezena = (int)Math.floor(unidade / 10) * 10;
            retorno = new int[dezena];
            retorno = new int[unidade-dezena];
        }

        return retorno;
    }

    public String imprimirValores(int hora, int minuto, int segundo) {
        return horaE[converteExtenso(hora)[0]] + "," + minutosE[converteExtenso(minuto)[0]] + "," + segundosE[converteExtenso(segundo)[0]];
    }
}

