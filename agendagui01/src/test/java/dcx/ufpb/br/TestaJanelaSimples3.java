package dcx.ufpb.br;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaJanelaSimples3 {
    public static void main(String[] args){
        final JFrame janela = new JFrame();
        janela.setTitle("Janela");
        janela.setLocation(0,0);
        janela.setSize(400, 400);
        JButton botao = new JButton("Botao");
        botao.setToolTipText("Dica: meu botão de teste");
        //lambda, por só ter uma linha de comnado pode-se não usar as chaves, como if e for
        botao.addActionListener((ae)-> JOptionPane.showMessageDialog(janela,"Testando botão"));
        janela.setLayout(new GridLayout(3, 1));
        janela.add(new JLabel());
        janela.add(botao);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
