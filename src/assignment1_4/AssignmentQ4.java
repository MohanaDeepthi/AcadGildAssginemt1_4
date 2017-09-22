package assignment1_4;
import java.util.*;
public class AssignmentQ4 {
	
	public static void main(String args[]){
		//six variables as one of each byte, short, int, long, float and double
		byte byteVar;
		short shortVar;
		int intVar;
		long longVar;
		float floatVar;
		double doubleVar;
		//Instantiate Scanner object
		Scanner userInput=new Scanner(System.in);
		try{
			//Taking byte and short input from user
			System.out.println("Enter Value : Byte ");
			byteVar=userInput.nextByte();
			System.out.println("Enter Value : short ");
			shortVar=userInput.nextShort();
			//Sum of byte and short and pass it to integer variable
			intVar=byteVar+shortVar;
			System.out.println("Sum of byte and short is "+intVar);
			//Sum of int and short and pass it to long variable
			longVar=intVar+shortVar;
			System.out.println("Sum of short and int is "+longVar);
			//Sum of int and long and pass it to float variable
			floatVar=(float)(longVar+intVar);
			System.out.println("Sum of long and int is "+floatVar);
			//Sum of float and long and pass it to double variable
			doubleVar=(double)(floatVar+longVar);
			System.out.println("Sum of long and float is "+doubleVar);
			
			
		}
		//Exception if incorrect number format is entered by user
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		finally{
			//closing scanner object
			userInput.close();
		}
		
		
	}

}
