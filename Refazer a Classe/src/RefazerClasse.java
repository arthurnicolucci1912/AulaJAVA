package telajava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaJAVA extends JFrame { 
    private JButton mensagem;
    private JButton fechar;

    public TelaJAVA(){  
        super("Teste do Componente OptionPane");   

        // === BOTÕES ===
        mensagem = new JButton("Mensagem");     
        fechar = new JButton("Fechar");       

        // === CONTAINER PRINCIPAL ===
        JPanel painelPrincipal = new JPanel(new BorderLayout(10,10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // === PAINEL DE BOTÕES ===
        JPanel painelBotoes = new JPanel(new GridLayout(2, 1, 10, 10));
        painelBotoes.add(mensagem);
        painelBotoes.add(fechar);

        painelPrincipal.add(painelBotoes, BorderLayout.CENTER);

        // === ADICIONA AO FRAME ===
        this.setContentPane(painelPrincipal);

        // === EVENTOS ===
        mensagem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
                buttonMensagemActionPerformed(b);
            }                  
        });

        fechar.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent b){
                buttonConfirmActionPerformed(b);
            }
        });

        // === CONFIGURAÇÕES DO FRAME ===
        this.setSize(400, 250);
        this.setLocationRelativeTo(null); // centraliza na tela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
   
    private void buttonMensagemActionPerformed(ActionEvent b){
        // Cria um input para o usuário digitar algo
        String entrada = JOptionPane.showInputDialog(this, "Digite uma palavra ou frase:", "Entrada de Texto", JOptionPane.QUESTION_MESSAGE);
        
        if (entrada != null && !entrada.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você digitou: " + entrada, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhuma frase foi digitada.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void buttonConfirmActionPerformed(ActionEvent b){
        int retorno = JOptionPane.showConfirmDialog(this,"Deseja Fechar?","Fechar",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
       
        if (retorno == JOptionPane.OK_OPTION){ 
            System.exit(0);
        }
    }
           
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaJAVA());  
    }            
}
