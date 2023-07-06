package aula06;

import aula05.DateYMD;

public class Aluno extends Pessoa {
    private final int NMec;
    private DateYMD dataInsc;
    private static int contador = 100;

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        super(nome, cc, dataNasc);
        this.dataInsc = dataInsc;
        this.NMec = contador++;
    }

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
        this.NMec = contador++;
    }

    public DateYMD getDataInsc() {
        return dataInsc;
    }

    public int getMec() {
        return NMec;
    }

    @Override
    public String toString() {
        return this.getnome() + ", NMec: " + this.getMec() + ", Data de inscrição: " + dataInsc;
    }
}
