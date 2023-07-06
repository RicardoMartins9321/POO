package aula06;

import aula05.Date;

public class Pessoa2 {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa2(String nome, int cc, Date dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }
    public Pessoa2(String nome, int cc) {
        this.nome = nome;
        this.cc = cc;
    }
    public Pessoa2(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public int getCc() {
        return cc;
    }

    public Date getdataNasc() {
        return dataNasc;
    }

    @Override

    public String toString() {
        return nome + ", CC: " + cc + ", Data de nascimento: " + dataNasc;
    }
}
