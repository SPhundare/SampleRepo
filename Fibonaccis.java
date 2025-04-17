package java_Program;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fibonaccis {

	public static void main(String[] args) {
		int no,no1=0,no2=1;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		System.out.print(no1 +" "+no2);
		
		for(int i=2;i<no;i++) {
		
			int no3=no1+no2;
			System.out.print(" "+no3);
			no1=no2;
			no2=no3;
			
			
		}
		
		
			
	
	
	}

}
