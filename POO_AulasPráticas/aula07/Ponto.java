package aula07;

public class Ponto {
    private double x;
    private double y;

    // Construtores

    public Ponto() {

    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Overrides

    @Override
    public String toString() {
        return "Ponto [x=" + x + ", y=" + y + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
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
        Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        return true;
    }

    // outros métodos

    public double distanceTo(Ponto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));

    }

}