package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;

public class LoginPage implements ActionListener{
    
    JFrame frame = new JFrame("Login system");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel("");
    HashMap<String,String> loginInfo = new HashMap<>();
            
    LoginPage( HashMap<String,String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        
        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        
        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);
        
        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font("Verdana", Font.ITALIC, 25));
       
        
        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        
        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        
        frame.add(userIDLabel);
        frame.add(userIDField);
        frame.add(userPasswordLabel);
        frame.add(userPasswordField);
        frame.add(messageLabel);
        
        frame.add(loginButton);
        frame.add(resetButton);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());
            
            if (loginInfo.containsKey(userID)){
                if (loginInfo.get(userID).equals(password)){
                    messageLabel.setForeground(new Color(34,235,40));
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    new WelcomePage(userID); 
                    
                }
            }
        }
        
        if ( e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }
    }
}
