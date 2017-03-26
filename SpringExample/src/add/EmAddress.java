package add;

public class EmAddress {

	 private String city;
	 private String state;
	 private String country;
	 
	 
	 public EmAddress(String city,String state,String country){
		 
		 
this.city = city;
this.state =state;
this.country=country;

	 }
public String toString(){
return city+" "+state+" "+country;

	 }
	 
	 
}
