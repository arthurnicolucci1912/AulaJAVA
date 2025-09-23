package animaljava;

// Classe Cachorro herdando de Mamifero
public class Cachorro extends Pets {

    public Cachorro(String nome, String raca, String tamanho) {
        super(nome, raca, tamanho, 4);
    }
    @Override
    public void emiteSom() {
        System.out.println(nome + ": AuAu!");
    }
}
