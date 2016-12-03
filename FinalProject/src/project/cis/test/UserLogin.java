package project.cis.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class UserLogin extends JFrame {
	//Create Font
	Font myFont = new Font("Monospaced",Font.PLAIN, 20);
  // Create text fields for username, password
  private JTextField jtfUsername = new JTextField();
  private JTextField jtfPassword = new JTextField();

  // Create login, register buttons
  private JButton login = new JButton("Login");
  private JButton register = new JButton("Register");
  
  public UserLogin() {
    // Panel p1 to hold labels and text fields
    JPanel p1 = new JPanel(new GridLayout(2, 2));
    p1.add(new JLabel("Username")).setFont(myFont);
    p1.add(jtfUsername).setFont(myFont);
    
    p1.add(new JLabel("Password")).setFont(myFont);
    p1.add(jtfPassword).setFont(myFont);

    // Panel p2 to hold the button
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    p2.add(register).setFont(myFont);
    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    p2.add(login).setFont(myFont);

    // Add the panels to the frame
    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH);

    // Register listener
    login.addActionListener(new ButtonListener());
  }

  /** Handle the Login button */
  private class ButtonListener implements ActionListener {
    @Override 
    public void actionPerformed(ActionEvent e) {
      // Get values from text fields
      String username = jtfUsername.getText();
      String password = jtfPassword.getText();
      
      // JACK: check database to see if entered username and password are in the database
      //I will write code to display exception for incorrect password at some point
    }
  }
  
  public static void main(String[] args) {
	UserLogin frame = new UserLogin();
	frame.pack();
	frame.setSize(500, 200);
    frame.setTitle("Java JEB Airlines");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}