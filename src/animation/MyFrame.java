package animation;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyPanel panel;
    
    MyFrame(){
        panel = new MyPanel();
        this.setTitle("Alien");
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);       
    }
}
