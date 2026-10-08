import javax.swing.*;

public class ClasseMetodos {
    public Estatistica[] cadastrarEstatistica(Estatistica[] estatisticas) {
        for (int i = 0; i < estatisticas.length; i++) {
            int codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade:"));
            String nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade:");
            int qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes:"));

            estatisticas[i] = new Estatistica(codigoCidade, nomeCidade, qtdAcidentes);
        }
        return estatisticas;
    }

    public void consultarPorQuantidadeAcidentes(Estatistica[] estatisticas) {
        for (int i = 0; i < estatisticas.length; i++) {
            if (estatisticas[i].QtdAcidentes > 100 && estatisticas[i].QtdAcidentes < 500) {
                JOptionPane.showMessageDialog(null, "Cidade: " + estatisticas[i].NomeCidade + "\nQuantidade de Acidentes: " + estatisticas[i].QtdAcidentes);
            }
        }
    }

    public void consultarPorEstatisticaAcidentes(Estatistica[] estatisticas) {
        int menorNumAcidentes = estatisticas[0].QtdAcidentes;
        int maiorNumAcidentes = estatisticas[0].QtdAcidentes;

        for (int i = 1; i < estatisticas.length; i++) {
            if (estatisticas[i].QtdAcidentes < menorNumAcidentes) {
                menorNumAcidentes = estatisticas[i].QtdAcidentes;
            }
            if (estatisticas[i].QtdAcidentes > maiorNumAcidentes) {
                maiorNumAcidentes = estatisticas[i].QtdAcidentes;
            }
        }

        JOptionPane.showMessageDialog(null, "Menor quantidade de acidentes: " + menorNumAcidentes);
        JOptionPane.showMessageDialog(null, "Maior quantidade de acidentes: " + maiorNumAcidentes);
    }

    public void consultarAcidentesAcimaDaMedia(Estatistica[] estatisticas) {
        int somaAcidentes = 0;
        for (int i = 0; i < estatisticas.length; i++) {
            somaAcidentes += estatisticas[i].QtdAcidentes;
        }
        double mediaAcidentes = (double) somaAcidentes / estatisticas.length;

        StringBuilder cidadesAcimaDaMedia = new StringBuilder();
        for (int i = 0; i < estatisticas.length; i++) {
            if (estatisticas[i].QtdAcidentes > mediaAcidentes) {
                cidadesAcimaDaMedia.append(estatisticas[i].NomeCidade).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, "Cidades com acidentes acima da média (" + mediaAcidentes + "):\n" + cidadesAcimaDaMedia.toString());
    }
}