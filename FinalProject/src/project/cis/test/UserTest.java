package project.cis.test;

import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java JEB Airlines");
		frame.setSize(500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);
		
	}

	public static void placeComponents(JPanel panel) {
		Font myFont = new Font("Monospaced",Font.PLAIN, 20);
		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(50, 10, 80, 25);
		panel.add(userLabel);
		userLabel.setFont(myFont);

		JTextField userText = new JTextField(20);
		userText.setBounds(230, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(50, 40, 100, 25);
		panel.add(passwordLabel);
		passwordLabel.setFont(myFont);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(230, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(50, 100, 150, 25);
		panel.add(loginButton);
		loginButton.setFont(myFont);
		
		JButton registerButton = new JButton("register");
		registerButton.setBounds(250, 100, 150, 25);
		panel.add(registerButton);
		registerButton.setFont(myFont);
	}
	


	
}
