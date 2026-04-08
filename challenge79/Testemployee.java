
import mypackchallenge79.Employee;

public class Testemployee{
	public static void main(String arg[]){
	Employee objemp= new Employee("sajid", 22, 30000);
	System.out.println(objemp.Employeedetails());
	
	objemp.setname("meena");
	System.out.println(objemp.Employeedetails());
	}
}
