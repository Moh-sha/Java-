import java.util.*;

public class While_loop
{
	
	public static void main (String[]args)
	
	{
		int num;
		int multi;
		Scanner input= new Scanner(System.in) ;
		System.out.println("Entered the number");
		num=input.nextInt();
		int i=1;
		while(i<=num)
		{
			
			multi=num*i;
			System.out.println("multi="+multi);
			i++;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}