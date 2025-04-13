package Day2;

public class CustomReverseString {
	public static void main(String[] args) {
        String input = "kambagiri";
//        String output = customReverseFormat(input);
//        System.out.println(output);
//    }
//
//    public static String customReverseFormat(String str) {
//        // Step 1: Reverse the string
        StringBuilder s= new StringBuilder(input);
        s.reverse().toString();

        // Step 2: Split the reversed string into groups as per the pattern
        String formatted = s.charAt(0) + " " + 
                          s.substring(1, 3) + " " + 
                           s.substring(3, 5) + " " + 
                           s.substring(5);
        
        System.out.println(formatted);

        
    }

		
	
}


