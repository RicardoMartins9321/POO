package aula06;

import aula05.DateYMD;

public class Pessoa {
    private String nome;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }
    public Pessoa(String nome, int cc) {
        this.nome = nome;
        this.cc = cc;
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public int getCc() {
        return cc;
    }

    public DateYMD getdataNasc() {
        return dataNasc;
    }

    @Override

    public String toString() {
        return nome + ", CC: " + cc + ", Data de nascimento: " + dataNasc;
    }
}
