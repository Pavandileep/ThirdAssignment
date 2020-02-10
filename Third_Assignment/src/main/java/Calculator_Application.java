import java.util.*;

public class Calculator_Application 
{
	static void displayCal()
	{
		System.out.println("---------------------------------------------------");
		System.out.println("|1\t|\t2\t|\t3\t|\t+|");
		System.out.println("|4\t|\t5\t|\t6\t|\t-|");
		System.out.println("|7\t|\t8\t|\t9\t|\t*|");
		System.out.println("|.\t|\t0\t|\t/\t|\t=|");
		
		System.out.println("---------------------------------------------------");
	}
	
	public static void main(String args[])
	{
		displayCal();
		String op;
		int num1,num2,result=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two Numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Enter the operator");
		op=sc.next();
				
		Math_Operators operator=new Math_Operators();
		
		switch(op)
		{
			case "+":
				result=operator.add(num1, num2);
				break;
			case "-":
				result=operator.sub(num1, num2);
				break;
			case "*":
				result=operator.mul(num1, num2);
				break;
			
			case "/":
				result=operator.div(num1, num2);
				break;
				
			default:
				System.out.println("Invalid operator");		
			
		}
		System.out.println(num1+" "+op+" "+num2+" = "+result);
		
		
		
		sc.close();
	}

}
