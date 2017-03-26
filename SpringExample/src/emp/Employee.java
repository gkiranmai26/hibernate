package emp;

import add.EmAddress;

public class Employee {

	
	private int id;
	private String name;
	private EmAddress address;
	
	
public Employee(int id,String name,EmAddress address){
	
	this.id = id;
	this.name = name;
	this.address = address;
}

 public void show(){
	System.out.println(id+" "+name);
	
System.out.println(address.toString());
	
}
}
