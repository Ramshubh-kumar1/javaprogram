class Person{
	String name;
	int age;
	
	void setdetails(String p_name, int p_age){
	this.name=p_name;
	this.age=p_age;
	}
	 
	void displayinfo(){
	System.out.println("Name="+name);
	System.out.println("Age="+age);

	}
	
}
class Persondetails{
	public static void main(String arg[]){
	Person person1=new Person();
	person1.setdetails("rahul",20);
	person1.displayinfo();
	}
}