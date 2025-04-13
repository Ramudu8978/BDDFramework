package ramsss;

public class SearchElement {
	
//         static void findElement(int a[])
//		{
//			for(int i=0;i<a.length;i++)
//			
//			
//				if(a[i]==30)
//				{
//					System.out.println("position:"+(i+1));
//				}
////				else
////				{
////					System.out.println("not found");
////				}
//				
//				
//		}	
//				
//				
//		
//         public static void main(String[] args)
//         {
//        	 int a[]= {10,20,30,40,50};
//        	 SearchElement f=new SearchElement();
//        	 f.findElement(a);
//        	 
        	 
        	
         public static void main(String[] args)
         {
        	 int a[]= {10,20,30,40,50};
        	 int position;
        	 int b=30;
        	 
        	 for(int i=0;i<a.length;i++)
        	 {
        		 if(a[i]==b)
        		 {
        			 position=i;
        		 
        		 System.out.println("position:"+(position+1));
        	 }
         }
        	 
  }
}
		
			
	
	
