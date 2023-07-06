package aula06;
import aula05.DateYMD;

public class Ex6_1 {
    public static void main(String[] args) {
        Aluno al = new Aluno ("Andreia Melo", 9855678, new DateYMD(18, 7, 1990), new DateYMD(1, 9, 2018));
        Professor p1 = new Professor("Andreia Melo", 9855678, new DateYMD(18, 7, 1990), "Associado", "Informática");
        Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new DateYMD(11, 5, 1985), p1, 900);
        bls.setBolsa(1050);
        
        System.out.println("Aluno: " + al.getnome());
        System.out.println(al);
        
        System.out.println("Bolseiro: " + bls.getnome() + ", NMec: " 
        + bls.getMec() + ", Bolsa: " + bls.getBolsa() + ", Orientador: " + 
        bls.getOrientador());
        System.out.println(bls);
    }
}
