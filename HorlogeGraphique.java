package exe2;

import javax.swing.*;
import java.awt.*;

public class HorlogeGraphique extends JLabel{

     public HorlogeGraphique(){
         this.setAlignmentX(JLabel.CENTER);
         Font font = this.getFont();
         Font ft= new Font (font.getName(),font.getStyle(),30);
         this.setFont(ft);
         afficheur afficheur1 = new afficheur();
         //afficheur1.run();
         Thread thread = new Thread (afficheur1);
         thread.start();
     }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Horloge Graphique");
        frame.setSize(200, 200);
        HorlogeGraphique HR= new HorlogeGraphique();
        //afficheur afficheur1 = new afficheur();
        //Thread thread = new Thread (afficheur1);
        //thread.start();
        frame.setContentPane(HR);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
