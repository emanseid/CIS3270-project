package project.cis3270.searchflight;
import javax.swing.*;
import java.awt.event.*;

public class Menu implements ActionListener{
	 static JFrame fr;
	 JPanel panel;
	 JMenuBar mb;
	 JMenu m;
	 JMenuItem search, booking, login,MyAccount,register;
	 
	 public Menu() {
		 fr = new JFrame();
		 mb = new JMenuBar();
		 m = new JMenu("Project");
		 search = new JMenuItem("Search");
		 booking = new JMenuItem("Booking");
		 login = new JMenuItem("Login");
		 register=new JMenuItem("register");
		 MyAccount= new JMenuItem("MyAccount");
		 
		 panel = new JPanel();
		 fr.getContentPane().add(panel);
		 
		 panel.add(mb);
		 mb.add(m);
		 m.add(search);
		 m.add(booking);
		 m.add(login);
		 m.add(MyAccount);
		 search.addActionListener(this);
		 booking.addActionListener(this);
		 MyAccount.addActionListener(this);
	 }
	 
	 public void actionPerformed(ActionEvent e1) {
		 if(e1.getSource() == search) {
			SearchFlight obj = new SearchFlight(); 
			panel.add(obj);
		 }
		 else if(e1.getSource() == booking) {
				Booking obj = new Booking(); 
				panel.add(obj);
			 }
		 else if(e1.getSource()== login){
			 
		 }
	 }
	 
	 public static void main(String[] args) {
		 Menu obj = new Menu();
		fr.setVisible(true);
		fr.pack();
	}

}
