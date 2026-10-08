import javax.swing.JOptionPane;

public class ClasseMenu {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[3]; // Array para armazenar 3 alunos

        ClasseMetodos metodos = new ClasseMetodos(); // Instanciação da classe ClasseMetodos
        int i;

        for (i = 0; i < aluno.length; i++) {
            aluno[i] = new Aluno(); // Inicializa cada elemento do array com o construtor padrão

            int opc = 0;

            while (opc != 3) {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1 - Cadastrar aluno\n2 - Mostrar alunos\n3 - Sair"));

                switch (opc) {
                    case 1 -> aluno = metodos.FCadastrarAluno(aluno);
                    case 2 -> metodos.mostrarAlunos(aluno);
                    case 3 -> {
                        JOptionPane.showMessageDialog(null, "Saindo do programa.");
                        System.exit(0);
                    }
                    default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                } // Fim do switch
            } // Fim do while
        }
    }
}