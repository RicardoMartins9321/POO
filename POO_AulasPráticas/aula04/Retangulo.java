package aula04;

public class Retangulo {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;

        if (comprimento <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Comprimento e altura devem ser valores positivos.");
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return altura;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Valor invalido");
        }
    }

    @Override
    public String toString() {
        return "Retângulo {\ncomprimento = " + comprimento + 
        ", \naltura = " + altura + 
        "\nArea = " + areaRetangulo(comprimento, altura) + 
        "\nPerimetro = " + PerimeterRetangulo(comprimento, altura) +
        "\n}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Retangulo) {
            Retangulo other = (Retangulo) obj;
            return comprimento == other.comprimento && altura == other.altura;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(altura);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(comprimento);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double areaRetangulo(double comprimento, double altura) {
        return altura * comprimento;
    }

    public double PerimeterRetangulo(double comprimento, double altura) {
        return 2*altura + 2*comprimento;
    }
}
