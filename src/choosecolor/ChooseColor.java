package choosecolor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChooseColor extends JFrame implements ActionListener {
    
    
    JButton button = new JButton("Select a color");
    JLabel label = new JLabel("Change color of this text");
    
    ChooseColor() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Choose Color");
      this.setLayout(new FlowLayout());
      button.addActionListener(this);
      
      label.setFont(new Font("MV Boli", Font.PLAIN, 25));
      label.setOpaque(true);
      this.add(label);
      this.add(button);
      this.pack();
      this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.yellow);
            label.setBackground(color);
            label.setForeground(color);
        }
    }
}
