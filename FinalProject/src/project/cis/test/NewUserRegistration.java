package project.cis.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;



public class NewUserRegistration extends JFrame {
		//Create Font
		Font myFont = new Font("Monospaced",Font.PLAIN, 20);
		// Create text fields for registration
	    private JTextField jtfFirst = new JTextField();
		private JTextField jtfLast = new JTextField();
		private JTextField jtfAddress = new JTextField();
		private JTextField jtfZip = new JTextField();
		private JTextField jtfState = new JTextField();
		private JTextField jtfNewUsername = new JTextField();
		private JTextField jtfNewPassword = new JTextField();
		private JTextField jtfEmail = new JTextField();
		private JTextField jtfSSN = new JTextField();
		private JTextField jtfSecurityQ = new JTextField();
		private JTextField jtfSecurityA = new JTextField();
		
		//Create register button
		private JButton register = new JButton("Register");
		
	public NewUserRegistration(){
		// Panel p1 to hold labels and text fields
	    JPanel p1 = new JPanel(new GridLayout(6, 2));
	    p1.add(new JLabel("First Name")).setFont(myFont);
	    p1.add(jtfFirst).setFont(myFont);
	    
	    p1.add(new JLabel("Last Name")).setFont(myFont);
	    p1.add(jtfLast).setFont(myFont);
	    
	    p1.add(new JLabel("Street Address")).setFont(myFont);
	    p1.add(jtfAddress).setFont(myFont);
	    
	    p1.add(new JLabel("Zip Code")).setFont(myFont);
	    p1.add(jtfZip).setFont(myFont);
	    
	    p1.add(new JLabel("State")).setFont(myFont);
	    p1.add(jtfState).setFont(myFont);
	    
	    p1.add(new JLabel("Username")).setFont(myFont);
	    p1.add(jtfNewUsername).setFont(myFont);
	    
	    p1.add(new JLabel("Password")).setFont(myFont);
	    p1.add(jtfNewPassword).setFont(myFont);
	    
	    p1.add(new JLabel("Security Question")).setFont(myFont);
	    p1.add(jtfSecurityQ).setFont(myFont);
	    
	    p1.add(new JLabel("Email")).setFont(myFont);
	    p1.add(jtfEmail).setFont(myFont);
	    
	    p1.add(new JLabel("Answer")).setFont(myFont);
	    p1.add(jtfSecurityA).setFont(myFont);
	    
	    p1.add(new JLabel("SSN")).setFont(myFont);
	    p1.add(jtfSSN).setFont(myFont);
	    
	    
	    p1.setBorder(new TitledBorder("Welcome New User!"));
	    
	    // Panel p2 to hold the button
	    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    p2.add(register).setFont(myFont);


	    // Add the panels to the frame
	    add(p1, BorderLayout.CENTER);
	    add(p2, BorderLayout.SOUTH);

	    // Register listener
	    register.addActionListener(new NewUserListener());
	}
	private class NewUserListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String firstName = jtfFirst.getText();
			String lastName = jtfLast.getText();
			String email = jtfEmail.getText(); //Check
			String address = jtfAddress.getText();
			String zip = jtfZip.getText(); //Check
			String state = jtfState.getText(); //Check
			String username = jtfNewUsername.getText(); //Check DB JACK :)
			String password = jtfNewPassword.getText(); //Check
			String securityQ = jtfSecurityQ.getText(); 
			String securityA = jtfSecurityA.getText();
			String SSN = jtfSSN.getText(); //Check
		}
		
	}
	 public static void main(String[] args) {
			NewUserRegistration frame = new NewUserRegistration();
			frame.pack();
			frame.setSize(1000, 350);
		    frame.setTitle("Java JEB Airlines");
		    frame.setLocationRelativeTo(null); // Center the frame
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		  }
}
