import javax.swing.*;

public class ClassePrincipal {
    public static void main(String[] args) {
        Estatistica[] estatisticas = new Estatistica[10]; // Array para armazenar as estatísticas de 10 cidades

        ClasseMetodos metodos = new ClasseMetodos();

        for (int i = 0; i < estatisticas.length; i++) {
            estatisticas[i] = new Estatistica();

            int opc = 0;

            while (opc != 3) {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Cadastrar Estatística\n2 - Consulta por quantidade de acidentes\n3 - Consultar por estatística de acidentes\n4 - Acidentes acima da média de 10 cidades\n9 - Sair"));

                switch (opc) {
                    case 1:
                        metodos.cadastrarEstatistica(estatisticas);
                        break;
                    case 2:
                        metodos.consultarPorQuantidadeAcidentes(estatisticas);
                        break;
                    case 3:
                        metodos.consultarPorEstatisticaAcidentes(estatisticas);
                        break;
                    case 4:
                        metodos.consultarAcidentesAcimaDaMedia(estatisticas);
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Saindo...");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            }
        }
    }
}