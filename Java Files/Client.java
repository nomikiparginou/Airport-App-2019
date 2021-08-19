import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		ArrayList<Airplane> planes = new ArrayList<Airplane>();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		ArrayList<Flight> flights = new ArrayList<Flight>();
		ArrayList<Seat> Seats = new ArrayList<Seat>();
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		ArrayList<String> foods = new ArrayList<String>();
		ArrayList<String> desserts = new ArrayList<String>();
		ArrayList<String> drinks = new ArrayList<String>();
		
		String description,code,food,drink,dessert,codeMenu=null,codeFlight,seatType,fullName,seat;
		String LocalDate,LocalTime,departure,destination,menuCode,ticketCode,fname,lname;
		int rows=0,columns=0,bRows=0,bookedSeats=0,seats=0,price=0;
		int input=-1,n=0,m=0,br=0;
		boolean check;
		Scanner scan = new Scanner(System.in);
		String startMenu = new String ("[1] Insert Airplane"+"\n[2]"+ "Insert Menu"+"\n"
		                                +"[3]Insert Flight"+"\n"+"[4] Cancel Flight"+
				                      "\n"+"[5] Book Ticket"+"\n"+"[6] Cancel Ticket"+"\n"
		                           +"[7] Order Menu Items (Available only in Business Seats)"+
				                "\n"+"[8] Seats Capacity for a certain Flight"+"\n"+"[0] Exit");
        
		do{
			System.out.println(startMenu);
			System.out.print("$");
			input=scan.nextInt();
			switch(input){
			  
			  case 1: 
				  
				  System.out.print("\nEnter Airplane ID: ");
				  code=scan.next();
				  System.out.print("\nEnter Airplane description: ");
				  description=scan.next();
				  System.out.print("\nEnter Number of rows: ");
				  rows=scan.nextInt();
				  System.out.print("\nEnter Number of Columns: ");
				  columns=scan.nextInt();
				  System.out.print("\nEnter Number of Business Rows: ");
				  bRows=scan.nextInt();
				  
				  Airplane plane = new Airplane(code,description,rows,columns, bRows);
				  planes.add(plane);
				  System.out.println("\nNew airplane was added successfully!\n");
				  break;
				  
			  case 2:
				  
				  check=true;
				  System.out.print("\nEnter Menu Code: ");
				  code=scan.next();
				  for (int i=0; i<menus.size(); i++){
						if (menus.contains(code)){
							check=false;
						}
				  }
				  if(check==true){
					
					 do{
				        System.out.print("\nEnter Food (or 'exit' to exit foods): ");
				        food=scan.next();
				        foods.add(food);
					 }while(!food.equals("exit"));
					   foods.remove("exit");
					 do{
						 System.out.print("\nEnter Dessert (or 'exit' to exit desserts): ");
						 dessert=scan.next();
						 desserts.add(dessert);
					 }while(!dessert.equals("exit"));
					    desserts.remove("exit");
					 do{
						 System.out.print("\nEnter Drink (or 'exit' to exit drinks): ");
						 drink=scan.next();
						 drinks.add(drink);
					 }while(!drink.equals("exit"));
			
					    drinks.remove("exit");
					 Menu menu = new Menu(code,foods,desserts,drinks);
					 menus.add(menu);
					 System.out.println("\nNew menu was added successfully!\n");
					 foods.clear();
					 drinks.clear();
					 desserts.clear();
				  }
				     else 
					  continue;
			  break;
				  
			  case 3: 
				  
				  check=true;
				  System.out.print("\nEnter Airplane code: ");
				  code=scan.next();
				  System.out.print("\nEnter Flight Date: ");
				  LocalDate=scan.next();
				  for (int i=0; i<planes.size(); i++){
						if (code.equals((planes.get(i)).getCode())){
							if(flights.size()==0)
								check=true;
							else{
							  for(int j=0; j<flights.size(); j++){
								  if((planes.get(i).getCode()).equals(flights.get(j).getCodePlane())){
									  if(LocalDate.equals(flights.get(j).getLocalDate())){
										  check=false;
										  System.out.println("The plane already has a flight that date!\n");  
									  }
								  }
							   }
							}
						}
				  }
				  if(check==true){
					  
					  System.out.print("\nEnter Flight Code: ");
					  codeFlight=scan.next();
					  System.out.print("\nEnter Local Time: ");
					  LocalTime=scan.next();
					  System.out.print("\nEnter Departure Airport: ");
					  departure=scan.next();
					  System.out.print("\nEnter Destination Airport: ");
					  destination=scan.next();
					  System.out.print("\nEnter Menu Code for flight: ");
					  menuCode=scan.next();
					  bookedSeats=0;
					  
					  for (int i=0; i<planes.size(); i++){
							if (code.contentEquals((planes.get(i)).getCode())){
								rows=planes.get(i).getRows();
							    columns=planes.get(i).getColumns();
							    bRows=planes.get(i).getBusinessRows();
							}
				       }
					 seats=rows*columns;
					 Flight flight = new Flight(codeFlight,code,LocalDate,LocalTime,
							                     departure,destination,menuCode,rows,columns,bRows);
	                 flight.setBookedSeats(bookedSeats);
	                 flight.setSeats(seats);
					 for(int i=0; i<columns*bRows; i++){
						flight.setSeat(" [[ ]] ");
					 }
					 for(int i=columns*bRows; i<rows*columns; i++){
						flight.setSeat(" [ ] ");
					 }
					 flights.add(flight);	
					 System.out.println("\nNew flight was added successfully\n");
				}
				  else 
					  continue; 
				break;
				
			  case 4:
				  
				  System.out.print("\nEnter Flight Code you wish to cancel: ");
				  codeFlight=scan.next();
				  for(int i=0; i<flights.size(); i++){
					  if(codeFlight.equals(flights.get(i).getCodeFlight())){
						  flights.remove(i);
						  System.out.println("\nFlight was cancelled successfully\n");
					  }
				  }
				  for(int i=0; i<tickets.size(); i++){
					  if(codeFlight.equals(tickets.get(i).getFlightCode())){
						  tickets.remove(i);
					  }
				  }
				  break;
				  
			  case 5: 
				
				  check=false;
				  System.out.print("\nEnter First Name: ");
				  fname=scan.next();
				  System.out.print("\nEnter Last Name: ");
				  lname=scan.next();
				  fullName=fname+" "+lname;
				  System.out.print("\nEnter Ticket code: ");
				  ticketCode=scan.next();
				  System.out.print("\nEnter Flight code: ");
                  codeFlight=scan.next();
                  System.out.print("\nEnter Local Date: ");
                  LocalDate=scan.next();
                  do{
                   System.out.print("\nEnter Seat Type (Economy or Business): ");
                   seatType=scan.next();
                  }while((!seatType.equals("Economy")) && (!seatType.equals("Business")));
             
                		 for(int i=0; i<flights.size(); i++){
                			 if(codeFlight.contentEquals(flights.get(i).getCodeFlight())){
                				 n=flights.get(i).getRows();
                				 m=flights.get(i).getColumns();
                				 br=flights.get(i).getBRows();
                				if(seatType.equals("Business")){
                				 for(int a=0; a<columns*bRows; a++){
                				   seat=flights.get(i).getSeat(a);
                				   if(seat.contentEquals(" [[ ]] ")){
                                     check=true;
                                     flights.get(i).fillSeat(a," [[X]] ");
                                     codeMenu=flights.get(i).getMenuCode();
                                     break;
                				   }
                				  }
                				 }
                				else{
                   				 for(int a=columns*bRows; a<columns*rows; a++){
                   				   seat=flights.get(i).getSeat(a);
                   				   if(seat.contentEquals(" [ ] ")){
                   					check=true; 
                   					flights.get(i).fillSeat(a," [X] ");
                   					break;
                   				   }
                   				 }
                   				}
                			  }
                		 }

                			  if(check==false){
                				  System.out.println("\nThere aren't any available Seats of this type");
                			  }
                			  else{
           
                	           System.out.print("\nEnter Seat Code: ");
             		           code=scan.next();
                	           if(seatType.equals("Economy")){
                		        EconomySeat ecoSeat = new EconomySeat(code,rows,columns,ticketCode);
                	            Seats.add(ecoSeat);
                	            System.out.printf("\nTicket for %s was booked succesfully!\n",fullName);
                	           }
                	           else{
                		        BusinessSeat busSeat = new BusinessSeat(code,rows,columns,ticketCode,codeMenu); 
                	            Seats.add(busSeat);
                	            
                	            System.out.printf("\nTicket for %s was booked succesfully!\n",fullName);
                	           }
                	           Ticket ticket = new Ticket(code,codeFlight,LocalDate,seatType,fullName,price);
                               tickets.add(ticket);
                           }
     
                 break;
                   
			  case 6:
				  
				  System.out.print("\nEnter Code of Ticket you wish to cancel: ");
				  ticketCode=scan.next();
				  for(int i=0; i<tickets.size(); i++){
					  if(ticketCode.equals(tickets.get(i).getCode())){
						  tickets.remove(i);
						  System.out.println("\nTicket was cancelled successfully\n");
					  }
				  }
				  break;
                  
			  case 7:
				   
				  System.out.println("\nEnter ticket code: ");
				  code=scan.next();
				  for(int i=0; i<Seats.size(); i++){
					  if(code.contentEquals(Seats.get(i).getTicket())){
						  if(Seats.get(i) instanceof BusinessSeat){
							 for(int x=0; x<menus.size(); x++){
								 if((Seats.get(i).getCodeMenu()).contentEquals(menus.get(x).getCode())){
									 System.out.print("\nChoose a food from the Menu: ");
									 System.out.println(menus.get(x).getFoods());
									 food=scan.next();
									 System.out.print("\nChoose a drink from the Menu: ");
									 System.out.println(menus.get(x).getDrinks());
									 drink=scan.next();
									 System.out.print("\nChoose a dessert from the Menu: ");
									 System.out.println(menus.get(x).getDesserts());
									 dessert=scan.next();
									 tickets.get(i).setFood(food);		
									 tickets.get(i).setDrink(drink);
									 tickets.get(i).setDessert(dessert);
								 }
							 }
						  }
					  }
				  }
				  break;
				  
			  case 8: 
				  
				  System.out.println("\nEnter Flight Code: ");
				  codeFlight=scan.next();
				  for(int i=0; i<flights.size(); i++){
					  if(codeFlight.equals(flights.get(i).getCodeFlight())){
						    rows=flights.get(i).getRows();
						    columns=flights.get(i).getColumns();
						    int b=0;
							for(int a=0; a<rows*columns; a++){
								 b++;
								 System.out.printf("%-10s",flights.get(i).getSeat(a));
								 if(b==4){ 
									 System.out.print("\n");
									 b=0;
								 }
							}
						}
				  }
				  break;
				  
			  case 0: 
				  break;
				  
			 default:
				  System.out.println("Wrong input!");
				  break;
			  }	  

	  }while(input!=0);
     scan.close();
    }
   }		


