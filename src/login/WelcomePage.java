package login;



import java.awt.Font;
import javax.swing.*;

public class WelcomePage extends JFrame {
    
    JLabel helloLabel = new JLabel();
    WelcomePage(String userID){
        this.setTitle("Welcome");       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        helloLabel.setFont(new Font("Ink Free", Font.ITALIC, 25));
        helloLabel.setBounds(0,0,200,35);
        helloLabel.setText("Hello " + userID);
        this.add(helloLabel);
        this.setVisible(true);
    }
    
}
