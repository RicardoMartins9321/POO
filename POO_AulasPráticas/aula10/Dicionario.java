package aula10;
import java.util.HashMap;
import java.util.Map;


public class Dicionario {
    private Map<String, String> termos;

    public Dicionario() {
        termos = new HashMap<String, String>();
    }

    public void adicionarTermo(String termo, String significado) {
        termos.put(termo, significado);
    }

    public void alterarTermo(String termo, String novoSignificado) {
        termos.put(termo, novoSignificado);
    }

    public void removerTermo(String termo) {
        termos.remove(termo);
    }

    public String getSignificado(String termo) {
        return termos.get(termo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String termo : termos.keySet()) {
            sb.append(termo + " - " + termos.get(termo) + "\n");
        }
        return sb.toString();
    }

    public String toStringTermos() {
        StringBuilder sb = new StringBuilder();
        for (String termo : termos.keySet()) {
            sb.append(termo + "\n");
        }
        return sb.toString();
    }

    public String toStringSignificados() {
        StringBuilder sb = new StringBuilder();
        for (String significado : termos.values()) {
            sb.append(significado + "\n");
        }
        return sb.toString();
    }
}
