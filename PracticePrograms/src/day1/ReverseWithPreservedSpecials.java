package day1;

public class ReverseWithPreservedSpecials {
	public static void main(String[] args)
	{
		
	
	  String input = "i love python";
      
      char[] c=input.toCharArray();
      char[] result=new char[c.length];
      
      for(int i=0;i<c.length;i++)
      {
    	  if(c[i]==' ')
    	  {
    		  result[i]=' ';
    	  }
      }
      int j=c.length-1;
      
      for(int i=0;i<c.length;i++)
      {
    	  if(c[i]!=' ')
    	  {
    		  while(result[j]==' ')
    		  {
    			  j--;
    		  }
    		  result[j]=c[i];
    		  j--;
    	  }
      }
      System.out.println(result);
    	  
      }
}
