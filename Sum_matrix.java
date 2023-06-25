import java.util.*;

public class Sum_matrix{
	
	
	public static void main (String[]args) 
	
	{
		Scanner input = new Scanner(System.in);
		
		int [][] A=new int [3][3];
		System.out.println("Entered the number ");
	 	 int sum_of_diaogonal=0;
	     int Sum_of_downer=0;
         int Sum_of_upper=0;
		 
		
		for(int row=0; row<3 ;row++)
		{ 
	             for(int colum=0;colum<3;colum++)
				 {
					 
					  
					 
					 A[row][colum]=input.nextInt();
					 
				 }
				 
				 
		}

    for(int row=0;row<3;row++)
	{

    for(int colum=0;colum<3;colum++)
	{
    if(row==colum){

     sum_of_diaogonal=sum_of_diaogonal+A[row][colum];
	
	}	
	
    if(row<colum)
	{
		Sum_of_upper=Sum_of_upper+A[row][colum];
		
	}	
	if(row>colum)
	{
		Sum_of_downer=Sum_of_downer+A[row][colum];
	}		
	}
	}
	
	
	
	System.out.println("sum_of_diaogonal"+sum_of_diaogonal);
    System.out.println("Sum_of_upper" + Sum_of_upper);
	System.out.println("Sum_of_downer" + Sum_of_downer);
	
	
	
	
	}
	
}