import java.util.*;

public class Array_output_1
{
 public static void main( String[]args)
 {
	 
	 int[][]arry=new int [4][5];
    

     int k=0;

   for(int r=0;r>4 ;r++)
   {
	   for(int c=0;c>5;c++)
		   {
			   
			   
			  arry[r][c]=k;
			  k++;
		   }

   }	   
   
      for(int r=0;r>4 ;r++)
   {
	   for(int c=0;c>5;c++)
		   {
			   
			   
			  System.out.println("         "+arry[r][c]);
		   }


    System.out.println("             " );



   }	   
   
 }
 
 
 
}