package animaljava;

// Classe abstrata Mamifero herdando de Animal
public abstract class Pets extends Animal {
    protected String nome;
    protected String raca;
    protected String tamanho;

    public Pets(String nome, String raca, String tamanho, int pernas) {
        super(pernas);
        this.nome = nome;
        this.raca = raca;
        this.tamanho = tamanho;
    }

    @Override
    public void caminha() {
        System.out.println(nome + " da raca " + raca + " esta caminhando com " + pernas + " pernas.");
    }


    public void emiteSom() {
        System.out.println(nome + "Miau!");
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTamanho() {
        return tamanho;
    }
}