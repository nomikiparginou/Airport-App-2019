
public class Ticket {
	
	private String Code,flightCode,LocalDate,SeatType,FullName,food,dessert,drink;
	private int Price;
	
	public Ticket(String Code,String flightCode,String LocalDate,String SeatType,String FullName,
			int Price){
		this.setCode(Code);
		this.setFlightCode(flightCode);
		this.setLocalDate(LocalDate);
		this.setSeatType(SeatType);
		this.setFullName(FullName);
		this.setPrice(Price);
	}
	
	public void setCode(String Code){
		this.Code=Code;
	}
	public String getCode(){
		return this.Code;
	}
	public void setFlightCode(String flightCode){
		this.flightCode=flightCode;
	}
	public String getFlightCode(){
		return this.flightCode;
	}
	public void setSeatType(String SeatType){
		this.SeatType=SeatType;
	}
	public String getSeatType(){
		return this.SeatType;
	}
	public void setLocalDate(String LocalDate){
		this.LocalDate=LocalDate;
	}
	public String getLocalDate(){
		return this.LocalDate;
	}
	public void setFullName(String FullName){
		this.FullName=FullName;
	}
	public String getFullName(){
		return this.FullName;
	}
	public void setFood(String food){
		this.food=food;
	}
	public String getFood(){
		return this.food;
	}
	public void setDessert(String dessert){
		this.dessert=dessert;
	}
	public String getDessert(){
		return this.dessert;
	}
	public void setDrink(String drink){
		this.drink=drink;
	}
	public String getDrink(){
		return this.drink;
	}
	public void setPrice(int Price){
		this.Price=Price;
	}
	public int getPrice(){
		return this.Price;
	}
}
