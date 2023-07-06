package aula06;

import aula05.Date;

public class Aluno2 extends Pessoa2 {
    private final int NMec;
    private Date dataInsc;
    private static int contador = 100;

    public Aluno2(String nome, int cc, Date dataNasc, Date dataInsc) {
        super(nome, cc, dataNasc);
        this.dataInsc = dataInsc;
        this.NMec = contador++;
    }

    public Aluno2(String nome, int cc, Date dataNasc) {
        super(nome, cc, dataNasc);
        this.NMec = contador++;
    }

    public Date getDataInsc() {
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
