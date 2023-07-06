package POO_2021_ExamePrático;

public class Restaurante {
    private String nome;
    private TipoComida tipoComida;

    public Restaurante(String nome, TipoComida tipoComida) {
        this.nome = nome;
        this.tipoComida = tipoComida;
    }

    public String getNome() {return nome;}
    public TipoComida getTipoComida() {return tipoComida;}

    public void setNome(String nome) {this.nome = nome;}
    public void setTipoComida(TipoComida tipoComida) {this.tipoComida = tipoComida;}

    @Override
    public String toString() {
        return "Restaurante [nome=" + this.getNome() + ", tipo=" + this.tipoComida() + "]";
    }

    public String tipoComida() {
        String t = this.getTipoComida().toString();
        String s = t.substring(0, 1) + t.substring(1).toLowerCase();
        return s;
    }
}
