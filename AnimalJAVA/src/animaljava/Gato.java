package animaljava;

public class Gato extends Pets {

    public Gato(String nome, String cor, String tamanho) {
        super(nome, cor, tamanho, 4); // Gato tem 4 pernas, usando "cor" como raça
    }

    // SOBRESCRITA do método emiteSom
    @Override
    public void emiteSom() {
        System.out.println(nome + " mia: Miau!");
    }

    // SOBRESCRITA do método comer
    @Override
    public void comer() {
        System.out.println(nome + " está comendo peixe");
    }

    // SOBRECARGA - métodos comer com diferentes parâmetros
    public void comer(int quantidade) {
        System.out.println(nome + " está comendo " + quantidade + " porções de comida");
    }

    public void comer(String tipoComida) {
        System.out.println(nome + " está comendo " + tipoComida);
    }

    public void comer(String tipoComida, int quantidade) {
        System.out.println(nome + " está comendo " + quantidade + " porções de " + tipoComida);
    }
}