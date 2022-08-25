
package progressbar;

import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BarProgressClass {
    JFrame frame = new JFrame("BarProgress");
    JProgressBar bar = new JProgressBar();
    
    
    BarProgressClass(){
        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD ,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        
        
        
        frame.add(bar);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setVisible(true);
        
        fill();
    }
    
    void fill(){
        int counter = 0;
        while(counter <= 100){
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(BarProgressClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            counter++;
        }
    }
    
}
