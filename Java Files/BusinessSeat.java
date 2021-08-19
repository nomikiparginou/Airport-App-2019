
public class BusinessSeat extends Seat {
	
	private String menu,codeMenu;
	
	BusinessSeat(String code,int row,int column,String ticket,String codeMenu){
		super(code,row,column,ticket);
		this.setCodeMenu(codeMenu);
	}
	
	public void setMenu(String menu){
		this.menu=menu;
	}
	public String getMenu(){
		return this.menu;
	}

	public String getCodeMenu() {
		return this.codeMenu;
	}

	public void setCodeMenu(String codeMenu) {
		this.codeMenu = codeMenu;
	}
	

}
