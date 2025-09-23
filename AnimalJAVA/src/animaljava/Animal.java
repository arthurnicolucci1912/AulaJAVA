package animaljava;

// Classe abstrata Animal
public abstract class Animal {
    protected int pernas;

    public Animal() {
        pernas = 0;
    }

    public Animal(int pernas) {
        this.pernas = pernas;
    }

    // Método abstrato
    public abstract void caminha();
}
