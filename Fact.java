package guvi;

import java.util.Scanner;

public class Fact 

{
public static void main(String[] args)
{	int x;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no you wanna calc fact of");
	int n=s.nextInt();
	x=fact(n);
	System.out.println(x);
	
}

public static int fact(int n)
{    
	  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
		 }   
}