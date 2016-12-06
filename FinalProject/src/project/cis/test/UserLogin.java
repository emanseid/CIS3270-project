package project.cis.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UserLogin extends JFrame{
	// Initializing database elements
	Connection con;
	Statement loginStmt;
	ResultSet rs;
	String url = "jdbc:mysql://localhost:3306/demo";
	String user = "root";
	String password = "root";
	
	public login(){
		
		try{
			// Connection to the database
			Connection con = DriverManager.getConnection(url,user,password);
			// Create a statement
			Statement loginStmt = myConn.createStatement();
			// Insert to database
			String sql = "insert into login "
					+ " (username, password)"
					+ " values (username, password)";
			// Inserting into database
			myStmt.executeUpdate(sql);
			
		}catch(Exception e){
			System.out.println(e.getMessage);
		}
	}
	//Create Font
	Font myFont = new Font("Monospaced",Font.PLAIN, 20);
  // Create text fields for main menu
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
    login.addActionListener(new LoginListener());
    register.addActionListener(new RegisterListener());
  }

  /** Handle the Login button */
  private class LoginListener implements ActionListener {
    @Override 
    public void actionPerformed(ActionEvent e) {
      // Get values from text fields
      String username = jtfUsername.getText();
      String password = jtfPassword.getText();
      
      // JACK: check database to see if entered username and password are in the database & correct
      //I will write the GUI for that
      
    }
  }
  private class RegisterListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//create new jframe, close main menu
		NewUserRegistration registration = new NewUserRegistration();
		registration.setVisible(true);
		registration.pack();
		registration.setSize(1000, 350);
	    registration.setTitle("Java JEB Airlines");
	    registration.setLocationRelativeTo(null); // Center the frame
	    registration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dispose();
		
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