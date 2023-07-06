package aula06;

public class Conjunto {
    // fazer um array de ints dá um vetor
    private int[] vetor;

    public Conjunto() {
        this.vetor = new int[0];
    }
    
    public int[] getVetor() {
        return vetor;
    }

    // para indicar se um dado elemento está no conjunto
    public boolean contains(int n) {
        for (int i = 0; i < vetor.length; i++) {
            if (n == vetor[i]) {
                return true;
            }
        }

        return false;
    }

    // para inserir um elemento novo no conjunto. Caso este elemento 
    // já exista, a função não faz nada. Inicialmente não se sabe quantos elementos vamos inserir.
    public void insert(int n) {
        if (this.contains(n)) {
            return;
        }

        int newlength = vetor.length + 1;
        int[] newvetor = new int[newlength];

        for (int i = 0; i < vetor.length; i++) {
            newvetor[i] = vetor[i];
        }

        newvetor[newlength - 1] = n;

        vetor = newvetor;
    }

    // para remover um elemento do conjunto Caso este elemento 
    // não se encontre no conjunto, a função não faz nada.
    public void remove(int n) {
        if (!this.contains(n)) {
            return;
        }

        int newlength = vetor.length - 1;
        int[] newvetor = new int[newlength];
        boolean removed = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                removed = true;
                continue;
            }

            if (!removed) {
                newvetor[i] = vetor[i];
            } else {
                newvetor[i - 1] = vetor[i];
            }
        }

        vetor = newvetor;
    }

    // para apagar todos os elementos do conjunto
    public void empty() {
        vetor = new int[0];
    }

    // - para calcular o número de elementos no conjunto
    public int size() {
        return vetor.length;
    }

    public String toString() {
        String s = "";

        for (int n : vetor) {
            s += n + " ";
        }

        return s;
    }

    // para construir um conjunto novo que representa a 
    // união de dois conjuntos. O conjunto resultante não deve conter elementos repetidos.
    public Conjunto combine(Conjunto add) {
        Conjunto nc = new Conjunto();
        nc = this;

        for (int i = 0; i < add.size(); i++) {
            int n = add.getVetor()[i];
            if (!nc.contains(n)) {
                nc.insert(n);
            }
        }
        return nc;
    }

    // para construir um conjunto novo que representa a 
    // diferença do this e dos elementos do conjunto representado pelo objeto dif.
    public Conjunto subtract(Conjunto dif) {
        Conjunto nc = new Conjunto();
        nc = this;

        for (int i = 0; i < dif.size(); i++) {
            int n = dif.getVetor()[i];
            if (nc.contains(n)) {
                nc.remove(n);
            }
        }
        return nc;
    }

    // para construir um conjunto novo que 
    // representa a intersecção do this com os elementos do conjunto representado pelo 
    // objeto inter. O conjunto resultante não pode conter elementos repetidos.
    public Conjunto intersect(Conjunto inter) {
        Conjunto nc = new Conjunto();

        for (int i = 0; i < inter.size(); i++) {
            int n = inter.getVetor()[i];
            if (this.contains(n)) {
                nc.insert(n);
            }
        }
        return nc;
    }
}
