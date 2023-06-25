import java.util.*;

public class arr_matrix{
	
	public static void main (String[]args)
	{
		Scanner input= new Scanner(System.in);
		int[][]A=new int [2][3];
		int[][]B=new int [2][3];
		
		
         System.out.println("Entered the number A " ) ;
		 
	    
		 
		for(int row=0;row<2;row++)
		{
				for(int coloum=0; coloum<3;coloum++)
					
					{
						A[row][coloum]=input.nextInt();
					}
		
		}		
				 System.out.println("A value is ");
				 
				 
		for(int row=0;row<2;row++)
		{
				for(int coloum=0; coloum<3;coloum++)
					
					{
				           System.out.println("A = "+A[row][coloum]);
					}
		
		}		
		
		 System.out.println("Entered The value " );
          
		for(int row=0;row<2; row++)
		{
				for(int coloum=0; coloum<3;coloum++)
					
					{
						B[row][coloum]=input.nextInt();
					}
		
		}		
		
		
		 System.out.println("B value is ");
	
		 
		for(int row=0;row<2; row++)
		{
				for(int coloum=0; coloum<3;coloum++)
					
					{
					System.out.println(" B =  "+B[row][coloum]);
					}
		
		}



     

     System.out.println("A+B");
       
     for(int row=0;row<2;row++)
     {
		 
	    	 for(int coloum=0;coloum<3 ;coloum++)
			 {
				System.out.println("A +B = " +(A[row][coloum]+B[row][coloum]));
				 
			 }				 
		
	 
	 }
		
	}
	
	
	
	
}