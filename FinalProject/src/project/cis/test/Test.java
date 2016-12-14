package project.cis.test;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Test extends MainMenu {
	public static void main(String[] args){
		
		JWindow window = new JWindow();
		//Creating and importing the splash screen
		window.getContentPane().add(new JLabel("",new ImageIcon("/Users/Brooke/Desktop/javaAir.jpg"),SwingConstants.CENTER));
		// Location of Splash Screen
		window.setBounds(100,500,1000,625);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		// Setting how long splash screen will display
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		// Closing the splash screen
		window.dispose();
		
		MainMenu obj = new MainMenu();
		fr.setVisible(true);
		fr.pack();
		fr.setLocationRelativeTo(null);
	}
}