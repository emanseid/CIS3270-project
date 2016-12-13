package project.cis3270.searchflight;

public class Flight {
	private int flightId;
	private int bookingId;
	private int sourceId; //flying from
	private int destinationId;//flying to
	private String departingDate;
	private String returningDate;
	private int noOfSeats;
	private int passengerId;
	private String dateOfBooking;
	private String time;
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBoookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getSourceId(){
		return sourceId;
	}
	public void setSourceID(int sourceId){
		this.sourceId=sourceId;
	}
	
	public int getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}
	
	public String getDepartingDate() {
		return departingDate;
	}
	public void setDateOfBooking(String DepartingDate) {
		this.departingDate = DepartingDate;}
	
	public String getReturningDate() {
		return returningDate;
	}
	public void setReturningDate(String ReturningDate) {
		this.returningDate = ReturningDate;}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int NoOfSeats) {
		this.noOfSeats = NoOfSeats;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;}

}
