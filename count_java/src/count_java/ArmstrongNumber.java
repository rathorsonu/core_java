package count_java;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String []args)
	{
		int num;
		int r,s=0,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter value");
		num=ob.nextInt();
		c=num;
	
		while(c>0)
		{
			r=c%10;
			s=s+(r*r*r);
			c=c/10;
		}
		if(s==num)
		{
			System.out.println("Number is Armstrong number");
		}
		else {
			System.out.println("Number is not Armstrong number");
		}
			
				
		
	}

}
