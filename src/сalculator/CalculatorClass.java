package сalculator;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class  CalculatorClass implements ActionListener {

    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JButton negButton;
    JPanel panel;
    JFrame frame = new JFrame();
    
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    
    double num1 = 0 , num2 = 0, result = 0;
    char operator;
    
    CalculatorClass(){
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setSize(420,550);
        frame.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");        
        divButton = new JButton("/");
        decButton = new JButton(".");       
        equButton = new JButton("=");
        negButton = new JButton("(-)");
        delButton = new JButton("Delete");       
        clrButton = new JButton("Clear");
        
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        
        for (int i = 0; i < 9; i++){
          functionButtons[i].addActionListener(this);
          functionButtons[i].setFont(myFont);
        }
         
        for (int i = 0; i < 10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        
        negButton.setBounds(5,430,80,50);
        negButton.setFont(myFont);
        delButton.setBounds(90,430,145,50);
        delButton.setFont(myFont);
        clrButton.setBounds(240,430,145,50);
        clrButton.setFont(myFont);
        
        panel = new JPanel();
        panel.setBounds(50,100, 300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        
       
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
                
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i = 0 ; i < 10; i++){
            if (e.getSource() == numberButtons[i]){
               textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        
        if (e.getSource() == decButton){
               textField.setText(textField.getText().concat("."));
        }
        
        if (e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        
        if (e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        
        if (e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        
        if (e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        
        if(e.getSource()==equButton) {
        num2=Double.parseDouble(textField.getText());
        switch(operator){
            case '+' : 
                result = num1 + num2;
                break;
            case '-' : 
                result = num1 - num2;
                break;
            case '*' : 
                result = num1 + num2;
                break;
            case '/' : 
                result = num1 + num2;
                break;            
        }
        textField.setText(String.valueOf(result));
        num1 = result;     
      }
        
        
      if (e.getSource()==clrButton){
          textField.setText("");
      }  
      
       if (e.getSource()==delButton){
           String string = textField.getText();
           textField.setText("");
           for (int i = 0; i < string.length()-1; i++){
               textField.setText(textField.getText() + string.charAt(i));
           }
       }
       
       if (e.getSource()==negButton){
           Double temp = Double.valueOf(textField.getText());
           temp*=-1;
           textField.setText(String.valueOf(temp));
       }
   }
  
}
