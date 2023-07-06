package aula04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;

        if(raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser um valor positivo");
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo {\nraio = " + raio 
        + "\narea = " + AreaCircle(raio) 
        + "\nperimetro = " + PerimeterCircle(raio) + 
        "\n}"; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circulo circulo = (Circulo) obj;
        return Double.compare(circulo.raio, raio) == 0;
    }

    @Override
    public int hashCode() {
        return (int) (raio * (Math.random() * 1000));
    }

    public double AreaCircle(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public double PerimeterCircle(double raio) {
        return Math.PI * 2*raio;
    }
}
