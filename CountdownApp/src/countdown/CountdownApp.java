package countdown;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CountdownApp {
private JFrame frame;
private JLabel label;
private JTextField textField;
private JButton startButton;
private Timer timer;
private int countdownTime;


public CountdownApp() {
// Create the main frame
frame = new JFrame("Countdown Timer");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 200);
frame.setLayout(new GridLayout(3, 1));


// Create and add label to display the countdown
label = new JLabel("Enter time in seconds:", SwingConstants.CENTER);
frame.add(label);


// Create and add a text field for user input
textField = new JTextField();
frame.add(textField);


// Create and add a start button
startButton = new JButton("Start Countdown");
frame.add(startButton);


// Add action listener to the button
startButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
startCountdown();
}
});


// Make the frame visible
frame.setVisible(true);
}


private void startCountdown() {
try {
countdownTime = Integer.parseInt(textField.getText());
if (countdownTime <= 0) {
JOptionPane.showMessageDialog(frame, "Please enter a positive number.");
return;
}
label.setText("Time remaining: " + countdownTime + " seconds");


// Create and start a timer
timer = new Timer(1000, new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
countdownTime--;
if (countdownTime <= 0) {
timer.stop();
label.setText("Time's up!");
} else {
label.setText("Time remaining: " + countdownTime + " seconds");
}
}
});
timer.start();
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
}
}


public static void main(String[] args) {
SwingUtilities.invokeLater(() -> new CountdownApp());
}
}

