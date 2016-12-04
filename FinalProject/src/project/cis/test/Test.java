package project.cis.test;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Test {
	public static void main(String[] args){
		
		JWindow window = new JWindow();
		//Creating and importing the splash screen
		window.getContentPane().add(new JLabel("",new ImageIcon("/Users/jackj/Desktop/plane.jpg"),SwingConstants.CENTER));
		// Location of Splash Screen
		window.setBounds(450,300,320,240);
		window.setVisible(true);
		// Setting how long splash screen will display
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		// Closing the splash screen
		window.dispose();
	}
}
