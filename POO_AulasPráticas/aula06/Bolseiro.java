package aula06;

import aula05.DateYMD;

public class Bolseiro extends Aluno {
    private int bolsa;
    private Professor p1;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        super(nome, cc, dataNasc, dataInsc);
    }

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor p1, int bolsa) {
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
        this.p1 = p1;
    }

    public Bolseiro(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc, int bolsa) {
        super(nome, cc, dataNasc, dataInsc);
        this.bolsa = bolsa;
    }

    public Bolseiro(String nome, int cc, DateYMD dataNasc, int bolsa) {
        super(nome, cc, dataNasc);
        this.bolsa = bolsa;
    }

    public int getBolsa() {
        return bolsa;
    }

    public Professor getOrientador() {
        return this.p1;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void setOrientador(Professor orientador) {
        this.p1 = orientador;
    }

    @Override
    public String toString() {
        return this.getnome() + ", NMec: " + this.getMec() + ", Data de Inscrição: " + this.getDataInsc() + ", Bolsa: " + this.getBolsa() + ", Orientador: " + p1;
    }
}
