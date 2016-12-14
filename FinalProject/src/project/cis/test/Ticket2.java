package project.cis.test;
import javax.swing.*;
import java.awt.*;
public class Ticket2 {
	// Main Window
			static JFrame fr;
			GridBagLayout gl;
			GridBagConstraints gc;
			// Caption
			JLabel lblTitle, lblName,lblBookingId,lblSeatNumber, lblFlyingto, lblFlyingFrom, lblTime, lblDate;
			// dropdown List
			JComboBox cbPassengerId, cbFlightId, cbClassId;
			// values which will be assigned to a dropdownlist
			//String[] passengerId = { "1", "2", "3", "4", "5" };
			//String[] flightId = { "1", "2", "3" };
			//String[] classId = { "1", "2", "3" };
			// this is added to a window and holds all the controls
			JPanel panel;
			// after accepting the input from the user
			JTextField txtBookingId,txtName,txtSeatNumber,txtFlyingto,txtFlyingfrom,txtTime,txtDate;
			// used for performing event handling
			//JButton button1,button2;

			public Ticket2() {
				// initializing the controls
				fr = new JFrame("Travel - Ticket Details");
				lblTitle = new JLabel("Ticket Details");
				lblBookingId = new JLabel("Booking Id");
				lblName= new JLabel("Name");
				
				lblSeatNumber = new JLabel("Seat #");
				lblFlyingto = new JLabel("Flying to");
				lblFlyingFrom = new JLabel("Flying From");
				lblTime = new JLabel("Time");
				lblDate = new JLabel("Date");
				
				panel = new JPanel();
				
				txtBookingId = new JTextField(30);
				txtName= new JTextField(30);
				txtSeatNumber = new JTextField(40);
				txtFlyingto = new JTextField(30);
				txtFlyingfrom = new JTextField(30);
				txtTime= new JTextField(20);
				txtDate= new JTextField(20);
				//button1 = new JButton("Book");
				//button2 = new JButton("Delete");

				gl = new GridBagLayout();
				gc = new GridBagConstraints();
				gc.insets = new Insets(20, 20, 5, 5);
			    
				// adding the panel to a frame
				fr.getContentPane().add(panel);
				// adding the controls to a panel
				panel.setLayout(gl);
				gc.gridx = 0;
			    gc.gridy = 0;
			    gc.gridwidth = 3;
			    gc.gridheight = 5;
			    panel.add(lblTitle,gc);
				addItem(panel, lblBookingId, 0, 1, 1, 1, GridBagConstraints.EAST);
				addItem(panel, txtBookingId, 1, 1, 2, 1, GridBagConstraints.WEST);
				addItem(panel, lblName,0,2,1,1,GridBagConstraints.EAST);
				addItem(panel, txtName, 1, 2, 2, 1, GridBagConstraints.WEST);
				addItem(panel, lblSeatNumber, 0, 3, 1, 1, GridBagConstraints.EAST);
				addItem(panel, txtSeatNumber, 1, 3, 2, 1, GridBagConstraints.WEST);
				addItem(panel, lblFlyingto, 0, 4, 1, 1, GridBagConstraints.EAST);
				addItem(panel, txtFlyingto, 1, 4, 2, 1, GridBagConstraints.WEST);
				addItem(panel, lblFlyingFrom, 0, 5, 1, 1, GridBagConstraints.EAST);
				addItem(panel, txtFlyingfrom, 1, 5, 3, 1, GridBagConstraints.WEST);
				addItem(panel, lblTime, 0, 6, 1, 1, GridBagConstraints.EAST);
				addItem(panel, txtTime, 1, 6, 4, 1, GridBagConstraints.WEST);
				addItem(panel, lblDate, 0, 7, 1, 1, GridBagConstraints.EAST);
				addItem(panel, txtDate, 1, 7, 5, 1, GridBagConstraints.WEST);
				//addItem(panel, lblTotalAmount, 0, 8, 1, 1, GridBagConstraints.EAST);
				//addItem(panel, txtTotalAmount, 1, 8, 6, 1, GridBagConstraints.WEST);
				//addItem(panel, button1, 0, 8, 1, 1, GridBagConstraints.EAST);
				//addItem(panel, button2,7,8,8,16, GridBagConstraints.WEST);
			}

			private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {
			    gc.gridx = x;
			    gc.gridy = y;
			    gc.gridwidth = width;
			    gc.gridheight = height;
			    gc.anchor = align;
			    p.add(c, gc);
			  }
			
			public void showTicketing(){
				Ticket2 obj = new Ticket2();
				// show the frame
				fr.setVisible(true);
				// set the size of the frame
				fr.setSize(300, 400);
				fr.setLocationRelativeTo(null);
			}
			

}