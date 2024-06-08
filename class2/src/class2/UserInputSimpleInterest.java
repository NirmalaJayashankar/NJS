package class2;
import java.util.Scanner;


public class UserInputSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principle amount");
	
		int p=sc.nextInt();
		System.out.println("enter rate of interest");

		float r=sc.nextFloat();
		System.out.println("enter time");

		int t=sc.nextInt();
		float interest=p*r*t/100;
		System.out.println("simple interest is"+interest);
		

	}

}
