import java.util.*;


public class C_exercise
{
	
	public static void main (String[]args)
	{
		
		int num;
		Scanner input= new Scanner (System.in);
		
	    System.out.println("Entered The num  :");
		num=input.nextInt();
        

        if(num>0)
		{
			System.out.println("Positive");
			
			
		}		
		
		else if(num<0) {
			
			System.out.println("Negetive");
			
			
		}
		
		
		else
		{
			
			System.out.println("zero");
		}
		
		
	}
	
}