package aula08;

public class Veiculo implements KmPercorridosInterface {
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    private int kmstotal = 0;
    private int kmstemp = 0;

    public Veiculo(String matricula, String marca, String modelo, int cilindrada) {
        if (isMatriculaValida(matricula)) {
            this.matricula = matricula;
        }
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void trajeto(int quilometros) {
        kmstemp = quilometros;
        kmstotal += quilometros;
    }

    @Override
    public int ultimoTrajeto() {
        return kmstemp;
    }

    @Override
    public int distanciaTotal() {
        return kmstotal;
    }

    @Override
    public String toString() {
        return "Matrícula: " + this.getMatricula() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo();
    }

    public boolean isMatriculaValida(String matricula) {
        if (matricula.length() != 8 || matricula.charAt(2) != '-' || matricula.charAt(5) != '-') {
            return false;
        }

        int numeros = 0, letras = 0;

        for (int contador = 0; contador < matricula.length(); contador++) {
            if (Character.isLetter(matricula.charAt(contador))) {
                if (matricula.charAt(contador) == (matricula.toUpperCase().charAt(contador))) {
                    ++letras;
                    continue;
                }
            }

            if (Character.isDigit(matricula.charAt(contador))) {
                ++numeros;
            }

            if (contador == 2) {
                if (numeros != 2 && letras != 2) {
                    return false;
                }
            }

            if (contador == 4) {
                if ((numeros != 2 || letras != 2) && (numeros != 4)) {
                    return false;
                }
            }

        }

        if (numeros == 4 && letras == 2) {
            return true;
        }
        return false;
    }
}
