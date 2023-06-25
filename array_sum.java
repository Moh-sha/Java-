import java.util.*;

public class array_sum
{
	
	
	
      public static void main (String[]args)
	  
	  {
		Scanner input=new Scanner(System.in); 
        
		
         double[] number =new double[5] ;//size of array
     		

			double sum=0;

	    System.out.println("Entered the number :");
        
        for(int i=1;i<5;i++)	
 
         {
		 number[i]=input.nextDouble();        
	 
	     }			
		  
	     for (int i=1;i<5;i++)	

		 {
			
			 sum=sum+number[i];
              			 
			System.out.println(sum);
		 }			 
		  
		  
		  
		  
	  }
	
	
	
	
	
	
	
}