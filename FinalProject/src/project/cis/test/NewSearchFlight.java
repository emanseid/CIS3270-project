package project.cis.test;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class NewSearchFlight {

	static JFrame frame;
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
	/*
		JTable jt = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		String[] colName = new String[5];
		
		colName[0] = "flightnum";
		colName[1] = "origin";
		colName[2] = "destination";
		colName[3] = "departing date";
		colName[4] = "time";
		
		model.setColumnIdentifiers(colName);
		
		Object[] rowData = new Object[5];
		
		for(int i = 0; i < getFlightTable().size();i++){
			rowData[0] = getFlightTable().get(i).getFlightnum();
			rowData[1] = getFlightTable().get(i).getOrigin();
			rowData[2] = getFlightTable().get(i).getDestination();
			rowData[3] = getFlightTable().get(i).getDepartingDate();
			rowData[4] = getFlightTable().get(i).getTime();
			model.addRow(rowData);
		}
		
		jt.setModel(model);
        
        Work window = new Work();
        
        JPanel panel = new JPanel();
        
        panel.setLayout(new BorderLayout());
        
        JScrollPane pane = new JScrollPane(jt);
        
        panel.add(pane,BorderLayout.CENTER);
        
        window.setContentPane(panel);*/
	
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
	 void initialize() {
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
				String origin = textField.getText();
				String destination = textField_1.getText();
				String departingDate = textField_2.getText();
				String time = textField_3.getText();
				
				if(origin ==null && destination==null && departingDate ==null && time ==null){
					getFlightTable();
				}
				
				FlightTable find = SearchDatabase(origin,destination,departingDate,time);
				

				JTable jt = new JTable();
				DefaultTableModel model = new DefaultTableModel();
				String[] colName = new String[5];
				
				colName[0] = "flightnum";
				colName[1] = "origin";
				colName[2] = "destination";
				colName[3] = "departing date";
				colName[4] = "time";
				
				model.setColumnIdentifiers(colName);
				
				Object[] rowData = new Object[5];
				
				for(int i = 0; i < 1.;i++){
					rowData[0] = find.getFlightnum();
					rowData[1] = find.getOrigin();
					rowData[2] = find.getDestination();
					rowData[3] = find.getDepartingDate();
					rowData[4] = find.getTime();
					model.addRow(rowData);
				}
				
				jt.setModel(model);
		        
		        Work window = new Work();
		        
		        JPanel panel = new JPanel();
		        
		        panel.setLayout(new BorderLayout());
		        
		        JScrollPane pane = new JScrollPane(jt);
		        
		        panel.add(pane,BorderLayout.CENTER);
		        
		        window.setContentPane(panel);
				
				
				
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
	
	
	
	public static FlightTable SearchDatabase(String origin, String destination, String departingDate, String time) {
		// Initialization of database components
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		String url = "jdbc:mysql://localhost:3306/JEB";
		String user = "root";
		String password = "May121992";
		String query = "select origin,destination,departingDate,time from flight where (origin = ? OR destination = ? OR departingDate = ? OR time = ?)";
				//+ "AND (destination = ? ) AND (departingDate = ? )"
				//+ "AND (time = ? )";

		try{
			// Connecting to mySql database
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			pst = con.prepareStatement(query);
			
			pst.setString(1,origin); 
			pst.setString(2,destination);
			pst.setString(3,departingDate); 
			pst.setString(4, time); 
			rs = pst.executeQuery();
			if(rs.next()){
			FlightTable ftable = new FlightTable(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
			
			return ftable;
			}
			//while(rs.next()){
			//	System.out.print(rs.getString(1) + " " + rs.getString(2)); // THIS PART is the output from database rs.getInt is flightid
			//}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return null;
		
		
	}
	
	static class FlightTable{
		private int bookingid;
		private int flightnum;
		private String origin;
		private String destination;
		private String departingDate;
		private String time;
		
		public FlightTable(String origin, String destination, String departingDate, String time){
			//this.flightnum = flightnum;
			this.origin = origin;
			this.destination = destination;
			this.departingDate = departingDate;
			this.time = time;
		}
		
		public int getBookingid() {
			return bookingid;
		}
		public void setBookingid(int bookingid) {
			this.bookingid = bookingid;
		}
		public int getFlightnum() {
			return flightnum;
		}
		public void setFlightnum(int flightnum) {
			this.flightnum = flightnum;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getDepartingDate() {
			return departingDate;
		}
		public void setDepartingDate(String departingDate) {
			this.departingDate = departingDate;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		
		
	}
	
	
	static ArrayList<FlightTable> getFlightTable(){
		ArrayList<FlightTable> ft = new ArrayList<FlightTable>();
		Connection con;
        Statement st;
        ResultSet rs;
        FlightTable ftable;
        String url = "jdbc:mysql://localhost:3306/JEB";
    	String user = "root";
    	String password = "May121992";
        try {
        	
        	con = DriverManager.getConnection(url,user,password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM flight");
            while(rs.next()){
                ftable = new FlightTable(
                		//rs.getInt("bookingid"),
                		rs.getString("origin"),
                		rs.getString("destination"),
                		rs.getString("departingDate"),
                		rs.getString("time")
                );   
                ft.add(ftable);
            }    
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        return ft;
    
	}
	
	
	public static class Work extends JFrame {
	    
	    public Work(){
	        
	        super("Bind JTable From MySQL DataBase");
	        
	        setLocationRelativeTo(null);
	        
	        setSize(600,400);
	        
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        setVisible(true);
	    }
	}
	
	
	
	
	
}