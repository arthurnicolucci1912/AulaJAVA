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
        mensagem = new JButton("Mensagem");     
        fechar = new JButton("Fechar");       
       
        Container pane = this.getContentPane(); 
       
        pane.add(mensagem);   
        pane.add(fechar);
       
        pane.setLayout(null);  
       
        mensagem.setBounds(20,30,150,35);   
        fechar.setBounds(20,90,150,35);
       
        /**Eventos**/
        mensagem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent b){
                buttonMensagemActionPerformed(b);
            }                  
        });
       
        fechar.addActionListener (new ActionListener(){
             public void actionPerformed(ActionEvent b){
                buttonConfirmActionPerformed(b);
            }
        });
       
        this.setSize(400,310);
        this.setContentPane(pane);
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
       
        if (retorno == JOptionPane.OK_OPTION){ // Corrigi aqui para só fechar no OK
            System.exit(0);
        }
    }
           
    public static void main(String[] args) {
        TelaJAVA p = new TelaJAVA();  
    }            
}
