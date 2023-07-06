package aula08;

public class Ex8_1 {
    public static void main(String[] args) {
        EmpresaAluguer empresa = new EmpresaAluguer("empresa", "3450-056", "empresa@gmail.com");
        Motociclo m = new Motociclo("67-FG-67", "Honda", "A30", 250, "desportivo");
        m.trajeto(50000);
        AutomovelLigeiro al = new AutomovelLigeiro("23-DF-45", "Ferrari", "F40", 340, 12, 100);
        al.trajeto(2000);
        PesadoMercadorias pm = new PesadoMercadorias("45-HJ-89", "Mercedes", "IO3", 100, 10, 2000, 1000);
        pm.trajeto(50);
        PesadoPassageiros pp = new PesadoPassageiros("56-CV-78", "Nissan", "FILO90", 90, 13, 1500, 40);
        pp.trajeto(40000);

        empresa.addVeiculo(m);
        empresa.addVeiculo(al);
        empresa.addVeiculo(pp);
        empresa.addVeiculo(pm);

        for (Veiculo veiculo : empresa.getVeiculosList()) {
            System.out.println(veiculo);
            System.out.println();
        }

        double max = 0;
        for (Veiculo veiculo : empresa.getVeiculosList()) {
            if (veiculo.distanciaTotal() > max) {
                max = veiculo.distanciaTotal();
            }
        }
        for (Veiculo veiculo : empresa.getVeiculosList()) {
            if (veiculo.distanciaTotal() == max) {
                System.out.println("Veículo com mais km percorridos: " + veiculo.distanciaTotal() + "km");
                System.out.println(veiculo);
            }
        }
    }
}
