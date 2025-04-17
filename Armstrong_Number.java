package java_Program;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		int no,sum=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		temp=no;
		while(no!=0) {
			rem=no%10;
			sum=sum+rem*rem*rem;
			no=no/10;
		}
	if(temp==sum)	{
System.out.println("Armstrong number");
	}
	else
		System.out.println("Not Armstrong number");

}
}
