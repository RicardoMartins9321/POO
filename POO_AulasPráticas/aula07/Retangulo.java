package aula07;

public class Retangulo extends Forma {
    private double comp;
    private double alt;

    // classe abstracta

    public double area() {
        return comp * alt;
    }

    public double perimetro() {
        return 2 * (comp + alt);
    }

    public String cor() {
        return getCor();
    }

    // Contrutor

    public Retangulo(double comp, double alt, String cor) {
        super(cor);
        this.comp = comp;
        this.alt = alt;
    }

    // getters e setters

    public double getComp() {
        return comp;
    }

    public double getAlt() {
        return alt;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    // Overrides

    @Override
    public String toString() {
        return "Retangulo [comprimento=" + comp + ", altura=" + alt + ", Area=" + area() + ", Perimetro=" + perimetro()
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(alt);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(comp);
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
        Retangulo other = (Retangulo) obj;
        if (Double.doubleToLongBits(alt) != Double.doubleToLongBits(other.alt))
            return false;
        if (Double.doubleToLongBits(comp) != Double.doubleToLongBits(other.comp))
            return false;
        return true;
    }
}
