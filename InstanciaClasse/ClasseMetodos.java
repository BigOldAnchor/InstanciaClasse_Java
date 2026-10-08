import javax.swing.JOptionPane;


public class ClasseMetodos {
    public Aluno[] FCadastrarAluno(Aluno[] aluno) {
        for (int i = 0; i < aluno.length; i++) {
            String pnome = JOptionPane.showInputDialog("Digite o primeiro nome do aluno " + (i + 1) + ":");
            String unome = JOptionPane.showInputDialog("Digite o sobrenome do aluno " + (i + 1) + ":");
            int pontos = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do aluno " + (i + 1) + ":"));

            aluno[i] = new Aluno(pnome, unome, pontos);
        }
        return aluno;
    }

    public void mostrarAlunos(Aluno[] aluno) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < aluno.length; i++) {
            sb.append("Aluno ").append(i + 1).append(":\n");
            sb.append("Nome: ").append(aluno[i].pnome).append("\n");
            sb.append("Sobrenome: ").append(aluno[i].unome).append("\n");
            sb.append("Pontos: ").append(aluno[i].pontos).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}