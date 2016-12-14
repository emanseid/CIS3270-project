package project.cis.test;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class MainMenu extends UserLogin implements ActionListener {
	 static JFrame fr;
	JPanel panel;
	 JMenuBar mb;
	 JMenu m;
	 JMenuItem  Login;
	public MainMenu(){ 
	 fr = new JFrame();
	 // creating the menu bar
	 mb = new JMenuBar();
	 //naming and creating the menu tab
	 m = new JMenu("Menu");
	 //creating the list to be included
	
	
	 Login = new JMenuItem("Login");
	 
	
	 //creating a panel
	 panel = new JPanel();
	 //adding the panel to the frame
	 fr.getContentPane();
	 //adding all the items to the menu
	 fr.add(mb);
	 mb.add(m);
	
	 m.add(Login);
	
	 
	 
	 
	 Login.addActionListener(this);
	 }
	
	 public void actionPerformed(ActionEvent e1) {
		 if(e1.getSource() == Login) {
			UserLogin obj = new UserLogin (); 
			obj.pack();
			obj.setSize(500, 200);
			obj.setTitle("Java JEB Airlines");
			obj.setVisible(true);
			obj.setLocationRelativeTo(null);
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
		 }
	 }
	 public static void main(String[] args) {
		MainMenu obj = new MainMenu();
		fr.setVisible(true);
		fr.pack();
		fr.setLocationRelativeTo(null);
	}

}