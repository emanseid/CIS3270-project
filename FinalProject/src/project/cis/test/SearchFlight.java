package project.cis3270.searchflight;
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchFlight extends JPanel implements ActionListener {
	//Main Window
		static JFrame fr;
		//Caption
		JLabel lblFrom,lblTo,lblDepartDate,lblReturnDate,lblAdult,lblChildren;
		//dropdown List
		JComboBox cbSoruce,cbDestination,cbAdults;
		//JComboBox cbChildrens;
		//values which will be assigned to a dropdownlist
		//created the string just to see how it would look on the combo box(jack)
		String []source = {"chicago","newyork"};
		String []destination = {"chicago","newyork"};
		String []adults = {"0","1","2","3","4","5"};
		//String []childrens = {"0","1","2"};
		//this is added to a window and holds all the controls
		JPanel panel;
		//option button
		JRadioButton rbOne,rbTwo;
		//after accepting the input from the user
		JTextField txtSourceDate,txtDestinationDate;
		//used for performing event handling
		JButton button;
		
		public SearchFlight() {
			//initializing the controls
			fr = new JFrame("Travel - Search");
			lblFrom = new JLabel("Flying From");
			lblTo = new JLabel("Flying To");
			lblDepartDate = new JLabel("Departing Date");
			lblReturnDate = new JLabel("Returning Date");
			lblAdult = new JLabel("Passenger");
			//lblChildren = new JLabel("Children (0-17)");
			panel = new JPanel();
			rbOne = new JRadioButton("OneWay");
			rbTwo = new JRadioButton("Return");
			cbSoruce = new JComboBox(source);
			cbDestination = new JComboBox(destination);
			cbAdults = new JComboBox(adults);
			//cbChildrens = new JComboBox(childrens);
			txtSourceDate = new JTextField(20);
			txtDestinationDate = new JTextField(20);
			button = new JButton("Search");
			
			//adding the panel to a frame
			//fr.getContentPane().add(panel);
			//adding the controls to a panel
			this.add(panel);
			panel.add(rbOne);
			panel.add(rbTwo);
			panel.add(lblFrom);
			panel.add(cbSoruce);
			panel.add(lblTo);
			panel.add(cbDestination);
			panel.add(lblDepartDate);
			panel.add(txtSourceDate);
			panel.add(lblReturnDate);
			panel.add(txtDestinationDate);
			panel.add(lblAdult);
			panel.add(cbAdults);
			//panel.add(lblChildren);
			//panel.add(cbChildrens);
			panel.add(button);
			button.addActionListener(this);
		}
		
		/*public static void main(String[] args) {
			//Jack
			SearchFlight obj = new SearchFlight();
			
			//show the frame
			fr.setVisible(true);
			//set the size of the frame
			fr.setSize(300, 400);
		}*/

		public void actionPerformed(ActionEvent e1) {
			if(e1.getSource() == button) {
				JOptionPane.showMessageDialog(panel, "Searching");
			}
			
		}

}
