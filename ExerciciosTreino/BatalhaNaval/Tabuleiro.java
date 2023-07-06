package ExerciciosTreino.BatalhaNaval;

import java.util.Arrays;

public class Tabuleiro {
    private char[][] grid;

    public Tabuleiro(int tamanho) {
        grid = new char[tamanho][tamanho];
        for (char[] row : grid) {
            Arrays.fill(row, '-');
        }
    }

    public void exibirTabuleiro() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public boolean posicionarNavio(int linha, int coluna) {
        if (grid[linha][coluna] == '-') {
            grid[linha][coluna] = 'N';
            return true;
        }
        return false;
    }

    public boolean realizarAtaque(int linha, int coluna) {
        if (grid[linha][coluna] == 'N') {
            grid[linha][coluna] = 'X';
            return true;
        }
        return false;
    }

    public boolean verificarVitoria() {
        for (char[] row : grid) {
            for (char cell : row) {
                if (cell == 'N') {
                    return false;
                }
            }
        }
        return true;
    }
}


