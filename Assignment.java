import java.util.*;

public class Assignment
{
 
 public static void main (String[]args)
{
 
     Scanner input=new Scanner(System.in);
	 
	 int x,y;
	 
	 
	 
	 System.out.println("Enter x number : ");
	 x=input.nextInt();
	 
	 
	 
	 System.out.println("Enter y number : ");
	 y=input.nextInt();
	 
	 
	 
	 
	 
	 x+=y;
	 System.out.println("x="+x);

	 x-=y;
	 System.out.println("x= "+x);

	 x*=y;
	 System.out.println("x="+x);

	 x/=y;
	 System.out.println(" x"+x);
	
	}

}