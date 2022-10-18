package dcx.ufpb.br;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUIV2 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon imagem = new ImageIcon("./src/images/aniversario.jpg");
    public AgendaGUIV2(){
        setTitle("Agenda de Aniversários");
        setSize(400,400);
        setLocation(150,150);
        setResizable(true);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD,24));
        linha2 = new JLabel(imagem, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }

    public static void main(String[] args){
        JFrame janela = new AgendaGUIV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
