import java.io.*;
import java.util.*;
class arm{
 public static void main(String args[])
 {
	 int i=0,l=0,temp=0,t;
	 Scanner s = new Scanner(System.in); 
	 System.out.print("Enter the numebr:");
	 int n=s.nextInt();
	 double sum=0;
	 i=n;
	 t=n;
	 while(i!=0)
	 {
		 i=i/10;
		 l++;
	 }
		 
	 while(n!=0)
	{
		temp=n%10;
		sum=sum+Math.pow(temp,l);
		n=n/10;
	}
	if(sum==t)
	{
	System.out.println("the armstrong number is"+sum);
	}
	else 
	{
		System.out.println("not an armstrong number");
	}
 }
}
