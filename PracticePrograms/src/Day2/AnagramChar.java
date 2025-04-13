package Day2;

import java.util.Arrays;

public class AnagramChar {
	public static void main(String[] args) {
        String str1 = "tomato";
        String str2 = "matoto";
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        Arrays.sort(arr1);

	
        
        
        System.out.println(arr1);
        System.out.println(arr2);
        
	
             if (Arrays.equals(arr1, arr2)) 
             {
            	 
            System.out.println("The given strings are Anagrams.");
        } 
             else 
             {
          
            	 System.out.println("The given strings are NOT Anagrams.");
             }
}

    

}
