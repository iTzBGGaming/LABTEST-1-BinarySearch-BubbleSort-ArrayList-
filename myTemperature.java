

public class myTemperature {
	
	 private String loc; //location
	 private float temp; //temperature

	 public myTemperature(String l, float t){
		 
	 loc=l;
	 temp=t;
	 }
	 
	 public String getLocation(){return loc;}
	 public float getTemperature(){return temp;}
	 
	 public String toString(){
	 return loc+" "+temp;
	 }
	 
}
