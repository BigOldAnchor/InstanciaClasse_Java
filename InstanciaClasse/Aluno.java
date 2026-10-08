public class Aluno {
    String pnome;
    String unome;
    int pontos;

    // Construtor padrão
    public Aluno() {
        this("Sem nome", "Sem sobrenome", 0);
    }
    // Construtor com parâmetros
    public Aluno(String pnome, String unome, int pontos) {
        this.pnome = pnome;
        this.unome = unome;
        this.pontos = pontos;
    }
}