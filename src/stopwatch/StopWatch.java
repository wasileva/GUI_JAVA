package stopwatch;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class StopWatch implements ActionListener{
    JFrame frame = new JFrame("StopWatch");
    JButton startButton = new JButton("START");
    JButton resetButton = new JButton("RESET");
    JLabel timeLabel = new JLabel();
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;
    String seconds_string;
    String minutes_string;
    String hours_string;
    
    
    Timer timer = new Timer(1000, new ActionListener(){
        public void actionPerformed(ActionEvent e){
            elapsedTime = elapsedTime + 1000;
            hours = (elapsedTime/3600000);
            minutes = (elapsedTime/60000)%60;
            seconds = (elapsedTime/1000)%60;
            initialization();
            
        }
    });
    
    StopWatch(){
        
        initialization();
        timeLabel.setText(hours_string+ ":" + minutes_string + ":" + seconds_string);
        timeLabel.setBounds(100,100,200,100);
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        
        startButton.setBounds(100, 200, 100, 50);
        startButton.setFont(new Font("Ink Free", Font.PLAIN,20));
        startButton.setFocusable(false);
        startButton.addActionListener(this);
        
        resetButton.setBounds(200, 200, 100, 50);
        resetButton.setFont(new Font("Ink Free", Font.PLAIN,20));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        
        frame.add(startButton);
        frame.add(resetButton);
        frame.add(timeLabel);
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton){
            if (started == false){
                start();
                started = true;
                startButton.setText("STOP");
            } else {
                stop();
                started = false;
                startButton.setText("START"); 
            }
        }
        
        if (e.getSource() == resetButton){
            reset();
        }
    }
    
    void initialization(){
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);
        timeLabel.setText(hours_string+ ":" + minutes_string + ":" + seconds_string);
    }
    
    void start(){
        timer.start();
    }
    
    void stop(){
        timer.stop();
    }
    
    void reset(){
        timer.stop();
        seconds = 0;
        minutes = 0;
        hours = 0;
        initialization();
    }
}
