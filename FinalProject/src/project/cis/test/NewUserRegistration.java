package project.cis.test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import project.cis.test.CheckPassword;



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
			String address = jtfAddress.getText();
			String email = jtfEmail.getText();
			String zip = jtfZip.getText(); 
			String state = jtfState.getText();
			String username = jtfNewUsername.getText(); //Check DB JACK :)
			String password = jtfNewPassword.getText();
			String securityQ = jtfSecurityQ.getText(); 
			String securityA = jtfSecurityA.getText();
			String SSN = jtfSSN.getText(); 
			//if username in system
			
			if(checkEmail(email)){System.out.println("valid email");}
			else{System.out.println("Email invalid");}
			
			if(checkZip(zip)){
				System.out.println("validzip");
			}else{System.out.println("Zip code invalid");}
			
			if(checkState(state)){
				System.out.println("Validstate");
			}else{System.out.println("State invalid");}
			
			if(checkPassword(password)){
				System.out.println("Valid password");
			}else{System.out.println("Password must be at least 8 characters, no special characters");}
			if(checkSSN(SSN)){
				System.out.println("Valid SSN");
			}else{System.out.println("SSN invalid");}
		}
		public boolean checkEmail(String email){
			String email1 = jtfEmail.getText();
			if(email1.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
				return true;
			}
			else{ return false;}
		}
		public boolean checkZip(String zip){
			String zip1 = jtfZip.getText();
			if(zip1.matches("^[0-9]{5}(?:-[0-9]{4})?$")){
				return true;
			}
			else{ return false;}
		}
		public boolean checkState(String state){
			String state1 = jtfState.getText();
			String [] stateArray = new String[]{"Alabama","AL",
					"Alaska","AK",
					"Arizona","AZ",
					"Arkansas","AR",
					"California","CA",
					"Colorado","CO",
					"Connecticut","CT",
					"DELAWARE","DE",
					"Florida","FL",
					"Georgia","GA",
					"Hawaii","HI",
					"Idaho","ID",
					"Illinois","IL",
					"Indiana","IN",
					"Iowa","IA",
					"Kansas","KS",
					"KENTUCKY","KY",
					"LOUISIANA","LA",
					"MAINE","ME",
					"MARYLAND","MD",
					"MASSACHUSETTS","MA",
					"MICHIGAN","MI",
					"MINNESOTA","MN",
					"MISSISSIPPI","MS",
					"MISSOURI","MO",
					"MONTANA","MT",
					"NEBRASKA","NE",
					"NEVADA","NV",
					"NEW HAMPSHIRE","NH",
					"NEW JERSEY","NJ",
					"NEW MEXICO","NM",
					"NEW YORK","NY",
					"NORTH CAROLINA","NC",
					"NORTH DAKOTA","ND",
					"OHIO","OH",
					"OKLAHOMA","OK",
					"OREGON","OR",
					"PENNSYLVANIA","PA",
					"RHODE ISLAND","RI",
					"SOUTH CAROLINA","SC",
					"SOUTH DAKOTA","SD",
					"TENNESSEE","TN",
					"TEXAS","TX",
					"UTAH","UT",
					"VERMONT","VT",
					"Virginia","VA",
					"Washington","WA",
					"WEST VIRGINIA","WV",
					"WISCONSIN","WI",
					"WYOMING","WY"};
			for(int index = 0; index<stateArray.length; index++){
				if(stateArray[index].equalsIgnoreCase(state1)){
					return true;
				}
			}
			return false;
		}
		public boolean checkPassword(String password){
			String password1 = jtfNewPassword.getText();
			final int minLength = 8;
			if(password1.length() >= minLength){
				for(int i = 0; i < password1.length(); i++){
					char c = password1.charAt(i);
					if(Character.isAlphabetic(c)){
						i++;
						return true;
					}else if(Character.isDigit(c)){
						i++;
						return true;
					}else{return false;}
					
				}
			}return false;
		}
		public boolean checkSSN(String SSN){
			String SSN1 = jtfSSN.getText();
			if(SSN1.matches("\\d{3}-\\d{2}-\\d{4}")){
				return true;
			}else{return false;}
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