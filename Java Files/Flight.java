import java.util.ArrayList;

public class Flight {
	
	
	private int seats,bookedSeats,rows,columns,bRows;
	private String codeFlight,LocalDate,LocalTime,departure,destination,codePlane,menuCode;
	ArrayList<String> Seats = new ArrayList<String>();
    
    Flight(String codeFlight,String codePlane, String LocalDate,String LocalTime,String departure,String destination,
    		String menuCode,int rows,int columns, int bRows){
    	this.setCodeFlight(codeFlight);
    	this.setCodePlane(codePlane);
    	this.setDeparture(departure);
    	this.setDestination(destination);
    	this.setLocalDate(LocalDate);
    	this.setLocalTime(LocalTime);
    	this.setMenuCode(menuCode);
    	this.setBrows(bRows);
    	this.setColumns(columns);
    	this.setRows(rows);
    }
    
    	
    public String getCodeFlight(){
		return this.codeFlight;
	}
    public void setCodeFlight(String codeFlight){
		this.codeFlight=codeFlight;
	}
	public void setLocalDate(String LocalDate){
		this.LocalDate=LocalDate;
	}
	public String getLocalDate(){
		return this.LocalDate;
	}
	public void setLocalTime(String LocalTime){
		this.LocalTime=LocalTime;
	}
	public String getLocalTime(){
		return this.LocalTime;
	}
	public void setDeparture(String departure){
		this.departure=departure;
	}
	public String getDeparture(){
		return this.departure;
	}
	public void setDestination(String destination){
		this.destination=destination;
	}
	public String getDestination(){
		return this.destination;
	}
	public void setMenuCode(String menuCode){
		this.menuCode=menuCode;
	}
	public String getMenuCode(){
		return this.menuCode;
	}
	public void setCodePlane(String codePlane){
		this.codePlane=codePlane;
	}
	public String getCodePlane(){
		return this.codePlane;
	}
	public void setSeats(int seats){
		this.seats=seats;
	}
	public int getSeats(){
		return this.seats;
	}
	public void setBookedSeats(int bookedSeats){
		this.bookedSeats=bookedSeats;
	}
	public int getBookedSeats(){
		return this.bookedSeats;
	}
	public void setRows(int rows){
		this.rows=rows;
	}
	public int getRows(){
		return this.rows;
	}
	public void setColumns(int columns){
		this.columns=columns;
	}
	public int getColumns(){
		return this.columns;
	}
	public void setBrows(int bRows){
		this.bRows=bRows;
	}
	public int getBRows(){
		return this.bRows;
	}
	
	public void setSeat(String s){
	    this.Seats.add(s);
	}
	public void fillSeat(int i,String s){
		this.Seats.add(i,s);
	}
	public String getSeat(int i){
		return this.Seats.get(i);
	}
	
	
}
