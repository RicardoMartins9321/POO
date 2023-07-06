package aula07;

public class Ex7_1 {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(0, 0);
        Circulo c1 = new Circulo(p1, 3, "Vermelho");
        Ponto p2 = new Ponto(0, 6);
        Circulo c2 = new Circulo(p2, 4, "Azul");

        System.out.println(c2.equals(c1));
    }
}
