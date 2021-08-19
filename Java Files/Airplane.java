
public class Airplane {
	
	private int rows,columns,businessRows;
	private String code,description;
	
	Airplane(String code,String description,int rows,int columns,int businessRows){
		this.setCode(code);
		this.setDescription(description);
		this.setRows(rows);
		this.setColumns(columns);
		this.setBusinessRows(businessRows);
		
	}

	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return this.code;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return this.description;
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
    public void setBusinessRows(int businessRows){
    	this.businessRows=businessRows;
    }
    public int getBusinessRows(){
    	return this.businessRows;
    }
    
}
