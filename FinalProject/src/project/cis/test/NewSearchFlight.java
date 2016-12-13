package project.cis3270.searchflight;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewSearchFlight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewSearchFlight window = new NewSearchFlight();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewSearchFlight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(174, 41, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 92, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 141, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 186, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblOrigin = new JLabel("Origin");
		lblOrigin.setBounds(82, 44, 46, 14);
		frame.getContentPane().add(lblOrigin);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(82, 95, 46, 14);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblDepartingDate = new JLabel("Departing Date");
		lblDepartingDate.setBounds(82, 144, 46, 14);
		frame.getContentPane().add(lblDepartingDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(82, 189, 46, 14);
		frame.getContentPane().add(lblTime);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSearch.setBounds(116, 227, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		textField_4 = new JTextField();
		textField_4.setBounds(338, 41, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAddFlight = new JButton("Add flight");
		btnAddFlight.setBounds(335, 106, 89, 23);
		frame.getContentPane().add(btnAddFlight);
		
		JLabel lblFlightNo = new JLabel("Flight No.");
		lblFlightNo.setBounds(282, 44, 46, 14);
		frame.getContentPane().add(lblFlightNo);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(335, 155, 89, 23);
		frame.getContentPane().add(btnDelete);
	}
}
