package rocketkey;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Key extends JFrame implements KeyListener{
    
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("rocket.png");
    
    Key(){
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Rocket Key");
        this.setSize(500,500);
        this.setLayout(null); 
        label.setBounds(0, 0, 80, 80);
        label.setIcon(icon);
        label.setForeground(Color.black);
        label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.addKeyListener(this);     
        this.setVisible(true);
        
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
       switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+10);
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
    
}
