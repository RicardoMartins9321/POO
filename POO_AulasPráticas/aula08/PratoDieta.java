package aula08;

public class PratoDieta extends Prato {
    double maximoCalorias;

    public PratoDieta(String nm, double maximoCalorias) {
        super(nm);
        this.maximoCalorias = maximoCalorias;
    }

    public double getMaximoCalorias() {
        return maximoCalorias;
    }

    public void setMaximoCalorias(double maximoCalorias) {
        this.maximoCalorias = maximoCalorias;
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
            return String.format("Prato %s, composto por %d Ingredientes - Dieta (%.2f Calorias), dia %s",
                    super.getNome(), super.getComposicao().size(), maximoCalorias, super.getDia());
        else
            return String.format("Prato %s, composto por %d Ingredientes - Dieta (%.2f Calorias)", super.getNome(),
                    super.getComposicao().size(), maximoCalorias);

    }
}
