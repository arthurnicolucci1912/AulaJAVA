package animaljava;

public class Peixe extends Animal {
    protected String nome;
    protected String especie;
    protected String tamanho;

    public Peixe(String nome, String especie, String tamanho) {
        super(0); // Peixe tem 0 pernas
        this.nome = nome;
        this.especie = especie;
        this.tamanho = tamanho;
    }

    @Override
    public void caminha() {
        System.out.println(nome + " não anda, ele nada!");
    }

    public void emiteSom() {
        System.out.println(nome + " faz glub glub");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo algas");
    }

    // SOBRECARGA específica para Peixe
    public void comer(boolean naSuperficie) {
        if (naSuperficie) {
            System.out.println(nome + " está comendo na superfície da água");
        } else {
            System.out.println(nome + " está comendo no fundo do aquário");
        }
    }

    // SOBRECARGA específica para Peixe
    public void comer(String tipoAlimento, boolean emMovimento) {
        if (emMovimento) {
            System.out.println(nome + " está comendo " + tipoAlimento + " enquanto nada");
        } else {
            System.out.println(nome + " está comendo " + tipoAlimento + " parado");
        }
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTamanho() {
        return tamanho;
    }
}