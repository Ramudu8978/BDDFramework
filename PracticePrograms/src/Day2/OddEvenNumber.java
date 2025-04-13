package Day2;

import java.util.Scanner;

public class OddEvenNumber {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter a number:");
	 int num=sc.nextInt();
	 if(num%2==0)
	 {
		 System.out.println("even number");
	 }
	 else
	 {
		 System.out.println("odd number");
	 }
 }
}
