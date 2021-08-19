import java.util.ArrayList;

public class Menu {
	
	private String code;
    private ArrayList<String> foods = new ArrayList<String>();
    private ArrayList<String> desserts = new ArrayList<String>();
    private ArrayList<String> drinks = new ArrayList<String>();
    
    Menu(String code,ArrayList<String> foods,ArrayList<String> desserts,
    	                                       ArrayList<String> drinks){
    	this.setCode(code);
    	this.setFoods(foods);
    	this.setDrinks(drinks);
    	this.setDesserts(desserts);
    }
    
    public void setCode(String code){
    	this.code=code;
    }
    public String getCode(){
    	return this.code;
    }
    public void setFoods(ArrayList<String> foods){
    	for (int i = 0; i < foods.size(); i++) {
    	    this.foods.add(i, foods.get(i)); 
    	}
    }
    public void setDesserts(ArrayList<String> desserts){
    	for (int i = 0; i < desserts.size(); i++) {
    	    this.desserts.add(i, desserts.get(i)); 
    	}
    }
    public void setDrinks(ArrayList<String> drinks){
    	for (int i = 0; i < drinks.size(); i++) {
    	    this.drinks.add(i, drinks.get(i)); 
    	}
    }
    public ArrayList<String> getFoods(){
    	return this.foods;
    }
    public ArrayList<String> getDesserts(){
    	return this.desserts;
    }
    public ArrayList<String> getDrinks(){
    	return this.drinks;
    }
    
    

}
