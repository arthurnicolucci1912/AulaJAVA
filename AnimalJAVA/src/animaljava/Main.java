package animaljava;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Princesa", "Pastor Alemao", "Grande");
        Cachorro c2 = new Cachorro("Belinha", "Vira-Lata", "Pequeno");
        Gato g1 = new Gato("Simba", "Laranja", "Pequeno");

        c1.caminha();
        c1.emiteSom();
        c2.caminha();
        g1.caminha();
        g1.emiteSom();
    }
}
