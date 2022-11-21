/* 
MATRIC   : 2021490434
NAME     : MUHAMMAD FAHMI AZHAR
GROUP    : KCS1103B
LECTURER : KHAIRUL ADILAH BINTI AHMAD
*/

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList alTemp = new ArrayList();
		char choice;

			System.out.println("\t\t\t Welcome to Sorting and Searching Program");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			//QUESTION 1
			// Repeatedly, READ the input from the users into an ArrayList named alTemp
			// until user terminates with a sentinel.

			System.out.print("Location: ");
			String loc = in.nextLine();
			System.out.print("Temperature : ");
			float temp= in.nextFloat();
			System.out.print("Continue (Y/N)");
			choice = in.next().charAt(0);
			in.nextLine();
			
			myTemperature array = new myTemperature (loc,temp);
			alTemp.add(array);
			
		while (choice=='y'){
			System.out.print("Location : ");
			String loc1 = in.nextLine();
			System.out.print("Temperature : ");
			float temp1= in.nextFloat();
			System.out.print("Continue (Y/N) : ");
			choice = in.next().charAt(0); 
			in.nextLine();
			
			myTemperature array1 = new myTemperature (loc1,temp1);
			alTemp.add(array1);
		}
				//QUESTION 2
				// DISPLAY the ArrayList values before sorting.
		
				System.out.println("Unsorted List: "+alTemp);
				
				//QUESTION 3
				// SORT the ArrayList based on temperature in ASCENDING order.
				
				for( int i=0; i < alTemp.size(); i++){
					for (int j = 1; j< alTemp.size()-i; j++){
						myTemperature temperature1 = (myTemperature) alTemp.get(j);
						myTemperature temperature2 = (myTemperature) alTemp.get(j-1);
							
						if(temperature1.getTemperature() < temperature2.getTemperature()){
							alTemp.set(j,  temperature2);
							alTemp.set(j-1,  temperature1);
						}
					}
				}
				
				//QUESTION 4
				// DISPLAY the ArrayList values after sorting.
				
				System.out.println("Sorted list: "+ alTemp);
				
				//QUESTION 5
				// SORT the ArrayList based on location in ASCENDING order.
				
				for ( int i = 0 ; i < alTemp.size() ; i++ ){
		            for( int j = 1 ; j < alTemp.size()-i ; j++ ){
		                myTemperature location1 = (myTemperature) alTemp.get(j);
		                myTemperature location2 = (myTemperature) alTemp.get(j-1);

		                if( location1.getLocation().compareToIgnoreCase(location2.getLocation())< 0){
		                    alTemp.set( j , location2 );
		                    alTemp.set( j-1 , location1 );
		                }
		            }
		        }
				
				//QUESTION 6
				// DISPLAY the ArrayList values after sorting.
				
		        System.out.println( "New Sorted list: "+ alTemp);
		        
		        //QUESTION 7
		        // Request search key and perform the binary search.
		        
	 			System.out.print( "SEARCH LOCATION : ");
	 			String search = in.nextLine();
	 			boolean find = false ;
	 			int lowest = 0 ;
	 			int middle = 0;
	 			int highest = alTemp.size()-1 ;
	 			int finalsearch = 0;
	 			myTemperature newtemp ;
	 			
	 	        while( lowest <= highest && !find)
	 	        {
	 	            middle = (lowest + highest)/2;
	 	            newtemp = (myTemperature) alTemp.get(middle);
	 	            int s = newtemp.getLocation().compareToIgnoreCase(search);
	 	            
	 	            	if ( s < 0)
	 	            		lowest = middle + 1;
	 	            	else if ( s == 0)
	 	            		find = true ;
	 	            	else 
	 	            		highest = middle -1 ;

	 	           finalsearch = alTemp.indexOf(newtemp);
	 	        }
	 	        System.out.println("Element is found at Index: "+ finalsearch ); 
	 	        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 	        System.out.println("\n\t\t Thank you and See You Again!");
        } 
	}




