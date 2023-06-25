import java.util.*;
import java.util.Arrays;
public class Array_Short 
{
 public static void main( String[]args)
 {
	 
	 int[]number={-10,3,6,7,9};
	 
    
 
    Arrays.sort(number);			   
	
	System.out.print("Assi value : ");
	
	
    for(int i=0;i<5;i++)
	{

        

        System.out.print("           "+  number[i]);
		
	}	
	
	
	
     
	System.out.print("Disc : " ); 
	
	 for(int i=4;i>=0;i--)

        {

        System.out.print("           "+ number[i]);
		
		
		}

	
}

}

