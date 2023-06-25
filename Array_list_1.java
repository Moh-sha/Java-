import java.util.*;
import java.util.ArrayList;


public class Array_list_1{
	
	public static void main(String[]args){
	
	ArrayList<Integer> number = new ArrayList<Integer>();
	

	
	//number add 
	
	number.add(40);
	number.add(20);
	number.add(30);
	number.add(90);
	number.add(3,20);
	
	
    System.out.println(number); 
      
    boolean b= number.contains(40);	  

	  System.out.println("contains  :  " + b);
    
	
	number.set(2, 100);
    
	System.out.println("Set : "+number );
   
   
   
}

}