package animaljava;

public abstract class Animal {
    protected int pernas;

    public Animal() {
        this.pernas = 0;
    }

    public Animal(int pernas) {
        this.pernas = pernas;
    }

    public abstract void caminha();

    // SOBRECARGA (Overloading) - Método comer com diferentes parâmetros
    public void comer() {
        System.out.println("O animal está comendo");
    }

    public void comer(int quantidade) {
        System.out.println("O animal está comendo " + quantidade + " porções de comida");
    }

    public void comer(String tipoComida) {
        System.out.println("O animal está comendo " + tipoComida);
    }

    public void comer(String tipoComida, int quantidade) {
        System.out.println("O animal está comendo " + quantidade + " porções de " + tipoComida);
    }

    // GETTERS
    public int getPernas() {
        return pernas;
    }
}