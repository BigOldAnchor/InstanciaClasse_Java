public class Estatistica {
    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;
    // Construtor padrão
    public Estatistica() {
        this.CodigoCidade = 0;
        this.NomeCidade = "";
        this.QtdAcidentes = 0;
    }
    // Construtor com parâmetros
    public Estatistica(int codigoCidade, String nomeCidade, int qtdAcidentes) {
        this.CodigoCidade = codigoCidade;
        this.NomeCidade = nomeCidade;
        this.QtdAcidentes = qtdAcidentes;
    }
}