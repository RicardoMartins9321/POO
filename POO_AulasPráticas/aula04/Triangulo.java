package aula04;

public class Triangulo {
    private double l1;
    private double l2;
    private double l3;

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;

        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            throw new IllegalArgumentException("Sides must be positive.");
        }
        if (l1 + l2 <= l3 || l2 + l3 <= l1 || l1 + l3 <= l2) {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
    }

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
        if (l1 > 0) {
            this.l1 = l1;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void setL2(double l2) {
        if (l2 > 0) {
            this.l2 = l2;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void setL3(double l3) {
        if (l3 > 0) {
            this.l3 = l3;
        } else {
            System.out.println("Valor invalido");
        }
    }

    @Override
    public String toString() {
        return "Triângulo {\n lado1 = " + l1 + 
        ", \n lado2 = " + l2 + 
        ", \n lado2 = " + l3 + 
        "\nArea = " + areaTriangulo() + 
        "\nPerimetro = " + PerimeterTriangulo() +
        "\n}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangulo) {
            Triangulo other = (Triangulo) obj;
            return l1 == other.l1 && 
            l2 == other.l2 && 
            l3 == other.l3;
        }
        return false;
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

    public double areaTriangulo() {
        double semiP = PerimeterTriangulo()/2;
        double area = Math.sqrt(semiP*(semiP-l1)*(semiP-l2)*(semiP-l3));
        return area;
    }

    public double PerimeterTriangulo() {
        return l1 + l2 + l3;
    }
}
