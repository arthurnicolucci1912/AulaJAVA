package animaljava;

public class Main {
    public static void main(String[] args) {
        // Criando os animais conforme seu exemplo
        Cachorro c1 = new Cachorro("Princesa", "Pastor Alemao", "Grande");
        Cachorro c2 = new Cachorro("Belinha", "Vira-Lata", "Pequeno");
        Gato g1 = new Gato("Simba", "Laranja", "Pequeno");

        // Criando um peixe para demonstrar o polimorfismo
        Peixe p1 = new Peixe("Nemo", "Palhaço", "Pequeno");

        // Testes originais
        System.out.println("=== TESTES ORIGINAIS ===");
        c1.caminha();
        c1.emiteSom();
        c2.caminha();
        g1.caminha();
        g1.emiteSom();

        System.out.println("\n=== TESTES DE POLIMORFISMO - SOBRESCRITA ===");
        // Demonstração de polimorfismo de sobrescrita
        Animal[] animais = {c1, c2, g1, p1};

        for (Animal animal : animais) {
            animal.caminha();    // Cada animal implementa de forma diferente
            if (animal instanceof Pets) {
                ((Pets) animal).emiteSom(); // Emite som específico
            } else if (animal instanceof Peixe) {
                ((Peixe) animal).emiteSom(); // Emite som do peixe
            }
            animal.comer();      // Método comer sobrescrito
            System.out.println(); // Linha em branco para separar
        }

        System.out.println("=== TESTES DE POLIMORFISMO - SOBRECARGA ===");
        // Demonstração de polimorfismo de sobrecarga
        System.out.println("\n--- Sobrecarga com Cachorro ---");
        c1.comer();                     // Versão sem parâmetros
        c1.comer(2);                   // Versão com quantidade
        c1.comer("osso");              // Versão com tipo de comida
        c1.comer("ração premium", 3);  // Versão com dois parâmetros

        System.out.println("\n--- Sobrecarga com Gato ---");
        g1.comer();                     // Versão sem parâmetros
        g1.comer(1);                   // Versão com quantidade
        g1.comer("peixe");             // Versão com tipo de comida
        g1.comer("sachê", 2);          // Versão com dois parâmetros

        System.out.println("\n--- Sobrecarga específica do Peixe ---");
        p1.comer();                     // Método sobrescrito
        p1.comer(true);                 // Sobrecarga específica - na superfície
        p1.comer(false);                // Sobrecarga específica - no fundo
        p1.comer("algas", true);        // Outra sobrecarga específica

        System.out.println("\n=== DEMONSTRAÇÃO DE POLIMORFISMO EM MÉTODO ===");
        // Chamando método que demonstra polimorfismo
        testarPolimorfismo(c1);
        testarPolimorfismo(g1);
        testarPolimorfismo(p1);

        System.out.println("\n=== INFORMAÇÕES DOS ANIMAIS (USANDO GETTERS) ===");
        // Mostrando informações específicas de cada animal usando getters
        System.out.println("Cachorro 1: " + c1.getNome() + " - " + c1.getRaca() + " - " + c1.getTamanho() + " - " + c1.getPernas() + " pernas");
        System.out.println("Cachorro 2: " + c2.getNome() + " - " + c2.getRaca() + " - " + c2.getTamanho() + " - " + c2.getPernas() + " pernas");
        System.out.println("Gato: " + g1.getNome() + " - " + g1.getRaca() + " - " + g1.getTamanho() + " - " + g1.getPernas() + " pernas");
        System.out.println("Peixe: " + p1.getNome() + " - " + p1.getEspecie() + " - " + p1.getTamanho() + " - " + p1.getPernas() + " pernas");
    }

    // Método que demonstra polimorfismo - aceita qualquer Animal
    public static void testarPolimorfismo(Animal animal) {
        System.out.print("Polimorfismo em ação: ");
        if (animal instanceof Pets) {
            ((Pets) animal).emiteSom();
        } else if (animal instanceof Peixe) {
            ((Peixe) animal).emiteSom();
        }
    }
}