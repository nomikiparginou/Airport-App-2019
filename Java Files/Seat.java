
public abstract class Seat {
	private int row,column;
	private String code,ticket;
	
	Seat(String code,int row,int column,String ticket){
		this.setCode(code);
		this.setRow(row);
		this.setColumn(column);
		this.setTicket(ticket);
	}
	
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return this.code;
	}
	public void setRow(int row){
		this.row=row;
	}
	public int getRow(){
		return this.row;
	}
	public void setColumn(int column){
		this.column=column;
	}
	public int getColumn(){
		return this.column;
	}
	public void setTicket(String ticket){
		this.ticket=ticket;
	}
	public String getTicket(){
		return this.ticket;
	}
	public String getCodeMenu() {
		return null;
	}

}
