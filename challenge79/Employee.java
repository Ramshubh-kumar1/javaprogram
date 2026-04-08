package mypackchallenge79;

 class Employee{
	private String name;
	private int age;
	private double salary;

 Employee (String name,int age,double salary){
	this.name=name;
	this.age=age;
	this.salary=salary;
	}
 String Employeedetails(){
	return"Employeedetails:= NAME:" +name+ "AGE:" +age+ "SALARY:" +salary;
	}

public String getname(){
	return name;
	}
public void setname(String name){
	this.name=name;
	}
public int getage(){
	return age;
	}
public void setage(int age){
	this.age=age;
	}

public double getsalary(){
	return age;
	}
public void setsalary(double salary){
	this.salary=salary;
	}
}