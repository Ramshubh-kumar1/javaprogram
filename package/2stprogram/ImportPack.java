import mypack1.Multiply;
import mypack1.Addition;
//import mypack1.*;

class ImportPack{
	public static void main(String arg[]){
	Addition  obj = new Addition();
        Multiply  obj1 =new Multiply();
 	int result =obj.add(12,3);
	int result2 =obj1.methodMultiply(12,3);

System.out.println( "add ="+ result);
System.out.println("multiply = "+ result2);

	
}

}