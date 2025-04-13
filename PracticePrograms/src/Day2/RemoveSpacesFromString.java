package Day2;

import java.util.Scanner;

public class RemoveSpacesFromString {
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
        String str =sc.nextLine();
        String result = str.replaceAll("\\s", ""); // Removes only spaces
        System.out.println(result); // Output: HelloWorldJava
    }

		
	
}
