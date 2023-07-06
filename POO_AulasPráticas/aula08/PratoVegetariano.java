package aula08;

public class PratoVegetariano extends Prato {
    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addIngrediente(Alimento c) {
        if (c instanceof ComidaVegetariana) {
            super.addIngrediente(c);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (super.getDia() != null)
            return String.format("Prato %s, composto por %d Ingredientes - Prato Vegetariano, dia %s", super.getNome(),
                    super.getComposicao().size(), super.getDia());
        else
            return String.format("Prato %s, composto por %d Ingredientes - Prato Vegetariano", super.getNome(),
                    super.getComposicao().size());

    }
}
