
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RefazerClasse extends JFrame {
    private JButton mensagem;
    private JButton fechar;

    public RefazerClasse() {
        super("Teste do Componente OptionPane");

        mensagem = new JButton("Mensagem");
        fechar = new JButton("Fechar");

        Container pane = this.getContentPane();
        pane.setLayout(null);

        mensagem.setBounds(20, 30, 150, 35);
        fechar.setBounds(20, 90, 150, 35);

        pane.add(mensagem);
        pane.add(fechar);

        /** Evento botão mensagem - agora usa showInputDialog **/
        mensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                buttonMensagemActionPerformed(b);
            }
        });

        fechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) {
                buttonConfirmActionPerformed(b);
            }
        });

        this.setSize(400, 310);
        this.setContentPane(pane);
        this.setVisible(true);
    }

    private void buttonMensagemActionPerformed(ActionEvent b) {
        String nome = JOptionPane.showInputDialog(this, "Digite seu nome:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);

        if (nome != null && !nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bem-vindo(a), " + nome + "!", "Saudação", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum nome informado.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void buttonConfirmActionPerformed(ActionEvent b) {
        int retorno = JOptionPane.showConfirmDialog(this, "Deseja fechar?", "Fechar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (retorno == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        RefazerClasse r = new RefazerClasse();
    }
}
