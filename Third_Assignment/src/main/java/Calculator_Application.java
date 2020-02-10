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
		while(true)
		{
			
			System.out.println("Enter two Numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			
			System.out.println("Enter the operator");
			op=sc.next();
					
			MathOperations operator;
			
			switch(op)
			{
				case "+":
					operator=new Addition();
					result=operator.calculate(num1, num2);
					break;
				case "-":
					operator=new Substration();
					result=operator.calculate(num1, num2);
					break;
				case "*":
					operator=new Multiplication();
					result=operator.calculate(num1, num2);
					break;
				
				case "/":
					operator=new Division();
					result=operator.calculate(num1, num2);
					break;
					
				default:
					System.out.println("Invalid operator");		
				
			}
			System.out.println(num1+" "+op+" "+num2+" = "+result);
			System.out.println("Press 1 to continue");
			int choice=sc.nextInt();
			if(choice != 1)
				break;					
		}
		
		sc.close();
	}

}
