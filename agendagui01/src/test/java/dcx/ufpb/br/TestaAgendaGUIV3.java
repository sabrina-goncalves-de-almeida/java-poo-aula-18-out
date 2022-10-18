package dcx.ufpb.br;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class TestaAgendaGUIV3 {
    public static void main(String[] args) throws IOException {
        final JFrame janela = new AgendaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        janela.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int resp = JOptionPane.showConfirmDialog(janela,"Tem certeza que quer sair?");
                if (resp == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
    }
    //SLIDE 28
}
