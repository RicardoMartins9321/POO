package aula07;

public class Triangulo extends Forma {
    private double l1;
    private double l2;
    private double l3;

    // metodos da classe abstracta

    public double area() {
        double p = this.Perimetro() / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));

    }

    public double perimetro() {
        return (l1 + l2 + l3);
    }

    public String cor() {
        return getCor();
    }

    // Construtores

    public Triangulo(double l1, double l2, double l3, String cor) {
        super(cor);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    // getters e setters

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    // Overrides

    @Override
    public String toString() {
        return "Triangulo [lado1=" + l1 + ", lado2=" + l2 + ", lado3=" + l3 + ", Perimetro=" + perimetro() + ", Area="
                + area() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(l1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(l2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(l3);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Triangulo other = (Triangulo) obj;
        if (Double.doubleToLongBits(l1) != Double.doubleToLongBits(other.l1))
            return false;
        if (Double.doubleToLongBits(l2) != Double.doubleToLongBits(other.l2))
            return false;
        if (Double.doubleToLongBits(l3) != Double.doubleToLongBits(other.l3))
            return false;
        return true;
    }

    // outros métodos

    public double Perimetro() {
        return (l1 + l2 + l3);
    }

    public double Area() { // Area= √p(p−a)(p−b)(p−c) sendo a,b,c os lados do triangulo e p metade do
                           // perimetro
        double p = this.Perimetro() / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

}