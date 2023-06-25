import java.util.*;

public class array_max_min
{
	
	
	
      public static void main (String[]args)
	  
	  {
		Scanner input=new Scanner(System.in); 
        
		
         double[] number =new double[5] ;
     		

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
		  
		  
		  double max=number[0];
		  double min=number[0];
		  
		  for(int i=1;i<5;i++)
		  {
			  
			 if(max<number[i])
			{				 
			  
			  
			 
             max=number[i]; 			  
			  
			  
		    }
		    
		  }		
			System.out.println("max="+max);
			  
		  
		  
		  
		  
		  for(int i=1;i<5;i++){
			  
			  
			  if(min>number[i])
			  {				  
			  
			     min=number[i];
		  
		  
		  
			  }
    
	
	     
	
	
		  }
		  
		  
		  
		  
		 System.out.println("min"+min); 
		  
		  
		  
	  }
	
	  }