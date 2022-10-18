package dcx.ufpb.br;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AgendaGUIV3 extends JFrame {

    public static void main(String[] args){
        JFrame janela = new AgendaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JLabel linha1, linha2;

    BufferedImage bufferedImage;

    {
        try {
            bufferedImage = ImageIO.read(new File("./src/images/aniversario.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Image image = bufferedImage.getScaledInstance(600, 500, Image.SCALE_DEFAULT);

    ImageIcon imagem = new ImageIcon(image);

    ImageIcon addImg = new ImageIcon("./src/images/addaniversariante.png");
    ImageIcon pesqImg = new ImageIcon("./src/images/pesquisaraniversariante.png");
    ImageIcon removeImg = new ImageIcon("./src/images/excluirdata.png");

    JButton botaoAdicionar, botaoPesquisar, botaoRemover;

    Agenda agenda = new AgendaAyla();

    public AgendaGUIV3(){
        setTitle("Agenda de Aniversários");
        setSize(1200,800);
        setLocation(150,150);
        setResizable(true);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD,24));
        linha2 = new JLabel(imagem, JLabel.CENTER);
        linha2.setBounds(400, 400, 400, 400);
        botaoAdicionar = new JButton("Adicionar", addImg);
        botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
        botaoPesquisar = new JButton("Pesquisar", pesqImg);
        botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover = new JButton("Remover", removeImg);
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));
        getContentPane().setLayout(new GridLayout(3,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

}
