package animaljava;

public class Cachorro extends Pets {

    public Cachorro(String nome, String raca, String tamanho) {
        super(nome, raca, tamanho, 4); // Cachorro tem 4 pernas
    }

    // SOBRESCRITA do método emiteSom
    @Override
    public void emiteSom() {
        System.out.println(nome + " late: Au Au!");
    }

    // SOBRESCRITA do método comer
    @Override
    public void comer() {
        System.out.println(nome + " está comendo ração");
    }

    // SOBRECARGA - métodos comer com diferentes parâmetros
    public void comer(int quantidade) {
        System.out.println(nome + " está comendo " + quantidade + " porções de ração");
    }

    public void comer(String tipoComida) {
        System.out.println(nome + " está comendo " + tipoComida);
    }

    public void comer(String tipoComida, int quantidade) {
        System.out.println(nome + " está comendo " + quantidade + " porções de " + tipoComida);
    }
}