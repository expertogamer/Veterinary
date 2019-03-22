package model;

public class Clinic {

	private String name;
	private Person p;
	
	public Clinic() {
		
		p = new Person();
		
	}
	
	public String getName() { return name; }
	
	public void setName(String nam) { name = nam; }
	
}
