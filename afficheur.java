package exe2;

import javax.swing.*;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;
//import javax.text.swing.JTextComponent;

public class afficheur extends JTextComponent implements Runnable  {

    int s=0,m=0;
    String min =" " , sec =" ";
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                return;
            }
            s++;
            if (s == 60) {
                s = 0;
                m++;
            }
            if (m == 60) {
                m = 0;
            }
            sec = (s < 10 ? "0" : "") + String.valueOf(s);
            min = (m < 10 ? "0" : "") + String.valueOf(m);

            this.setText(min + ":" + sec);


        }
    }


}
