package animaljava;

// Classe Gato herdando de Mamifero
public class Gato extends Pets {

    public Gato(String nome, String raca, String tamanho) {
        super(nome, raca, tamanho, 4);
    }
    
    @Override
    public void emiteSom() {
        System.out.println(nome + ": Miau!");
    }
}
