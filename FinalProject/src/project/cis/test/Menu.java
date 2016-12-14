//package project.cis.test;
import javax.swing.*;

//import project.cis.test.NewUserRegistration.NewUserListener;

import java.awt.event.*;


public class Menu extends NewUserRegistration implements ActionListener{
	 static JFrame fr;
	 JPanel panel;
	 JMenuBar mb;
	 JMenu m;
	 JMenuItem search, booking;
	 
	 public Menu() {
		 //creating the frame
		 fr = new JFrame();
		 // creating the menu bar
		 mb = new JMenuBar();
		 //naming and creating the menu tab
		 m = new JMenu("Book Flight");
		 //creating the list to be included
		 search = new JMenuItem("Search");
		 booking = new JMenuItem("Booking");
		 
		
		 
		 //creating a panel
		 panel = new JPanel();
		 //adding the panel to the frame
		 fr.getContentPane().add(panel);
		 //adding all the items to the menu
		 panel.add(mb);
		 mb.add(m);
		 m.add(search);
		 m.add(booking);
		
		
		 
		 search.addActionListener(this);
		 booking.addActionListener(this);
		 
	 }
	 //event handling for Search flight
	 public void actionPerformed(ActionEvent e1) {
		 if(e1.getSource() == search) {
			NewSearchFlight obj = new NewSearchFlight(); 
			NewSearchFlight.frame.setVisible(true);
			NewSearchFlight.frame.setLocationRelativeTo(null);
			NewSearchFlight.frame.setSize(500,400);
			dispose();
			
		 }
		 //event handling for booking
		 else if(e1.getSource() == booking) {
				Booking obj = new Booking(); 
				panel.add(obj);
				fr.setSize(600,700);
				fr.setLocationRelativeTo(null);
				
			 }
		
			 
		 }
	 
	 //display
	 public static void main(String[] args) {
		 Menu obj = new Menu();
		fr.setVisible(true);
		fr.pack();
		fr.setLocationRelativeTo(null);
	}

}