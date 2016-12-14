package project.cis.test;
import javax.swing.*;

import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class Booking extends JPanel implements ActionListener{
	// Main Window
	static JFrame fr;
	GridBagLayout gl;
	GridBagConstraints gc;
	// Caption
	JLabel lblBookingId, lblDateOfBooking, lblFlyingfrom, lblFlyingto, lblDate, lblTime, lblPassengerID, lblFlightId,
			lblClassId, lblNoOfSeats, lblTotalAmount, lblCaption;
	// dropdown List
	JComboBox cbPassengerId, cbFlightId, cbClassId;
	// Jack ids from the database
	String[] passengerId = { "1", "2", "3", "4", "5" };
	String[] flightId = { "1", "2", "3" };
	String[] classId = { "1", "2", "3" };
	// this is added to a window and holds all the controls
	JPanel panel;
	// after accepting the input from the user
	JTextField txtBookingId, txtDateOfBooking, txtNoOfSeats, txtTotalAmount, txtFlyingFrom, txtFlyingTo, txtTime,
			txtDate;
	// used for performing event handling
	JButton button1, button2;

	public Booking() {
		// initializing the controls
		fr = new JFrame("Travel - Booking Details");
		lblCaption = new JLabel("Add - Booking Details");
		lblBookingId = new JLabel("Booking Id");
		lblDateOfBooking = new JLabel("Date of Booking");
		lblPassengerID = new JLabel("Passenger Id");
		lblFlightId = new JLabel("Flight Id");
		lblClassId = new JLabel("Class Id");
		lblNoOfSeats = new JLabel("Seat #");
		lblFlyingfrom = new JLabel("Flying From");
		lblFlyingto = new JLabel("Flying To");
		lblDate = new JLabel("Date");
		lblTime = new JLabel("Time");
		lblTotalAmount = new JLabel("Total Amount");
		panel = new JPanel();
		cbPassengerId = new JComboBox(passengerId);
		cbFlightId = new JComboBox(flightId);
		cbClassId = new JComboBox(classId);
		txtBookingId = new JTextField(30);
		txtDateOfBooking = new JTextField(40);
		txtNoOfSeats = new JTextField(30);
		txtFlyingFrom = new JTextField(30);
		txtFlyingTo = new JTextField(30);
		txtTime = new JTextField(30);
		txtDate = new JTextField(30);
		txtTotalAmount = new JTextField(30);
		button1 = new JButton("Book");
		button2 = new JButton("Delete");

		gl = new GridBagLayout();
		gc = new GridBagConstraints();
		gc.insets = new Insets(20, 20, 5, 5);

		// adding the panel to a frame
		//fr.getContentPane().add(panel);
		// adding the controls to a panel
		this.add(panel);
		panel.setLayout(gl);
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 3;
		gc.gridheight = 5;
		panel.add(lblCaption, gc);
		addItem(panel, lblBookingId, 0, 1, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtBookingId, 1, 1, 2, 1, GridBagConstraints.WEST);
		addItem(panel, lblDateOfBooking, 0, 2, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtDateOfBooking, 1, 2, 2, 1, GridBagConstraints.WEST);
		addItem(panel, lblPassengerID, 0, 3, 1, 1, GridBagConstraints.EAST);
		addItem(panel, cbPassengerId, 1, 3, 2, 1, GridBagConstraints.WEST);
		addItem(panel, lblFlightId, 0, 4, 1, 1, GridBagConstraints.EAST);
		addItem(panel, cbFlightId, 1, 4, 3, 1, GridBagConstraints.WEST);
		addItem(panel, lblClassId, 0, 5, 1, 1, GridBagConstraints.EAST);
		addItem(panel, cbClassId, 1, 5, 4, 1, GridBagConstraints.WEST);
		addItem(panel, lblNoOfSeats, 0, 6, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtNoOfSeats, 1, 6, 5, 1, GridBagConstraints.WEST);
		addItem(panel, lblFlyingfrom, 0, 7, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtFlyingFrom, 1, 7, 6, 1, GridBagConstraints.WEST);
		addItem(panel, lblFlyingto, 0, 8, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtFlyingTo, 1, 8, 7, 1, GridBagConstraints.WEST);
		addItem(panel, lblTime, 0, 9, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtTime, 1, 9, 8, 1, GridBagConstraints.WEST);
		addItem(panel, lblDate, 0, 10, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtDate, 1, 10, 9, 1, GridBagConstraints.WEST);
		addItem(panel, lblTotalAmount, 0, 11, 1, 1, GridBagConstraints.EAST);
		addItem(panel, txtTotalAmount, 1, 11, 10, 1, GridBagConstraints.WEST);
		addItem(panel, button1, 1, 12, 1, 1, GridBagConstraints.NORTH);
		addItem(panel, button2, 2, 12, 1, 1, GridBagConstraints.NORTH);
		button1.addActionListener(this);
	}

	private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
		gc.gridx = x;
		gc.gridy = y;
		gc.gridwidth = width;
		gc.gridheight = height;
		gc.anchor = align;
		p.add(c, gc);
	}

	/*public static void main(String[] args) {
		Booking obj = new Booking();
		// show the frame
		fr.setVisible(true);
		// set the size of the frame
		fr.setSize(300, 400);
	}*/
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			
			Ticket2 obj = new Ticket2();
			fr.setVisible(false);
			obj.showTicketing();
			
			
			
		}
	}	
			

}