import java.io.*;
import java.util.*;

class bank{
	public static void main(String[] args)
	{   int i;
	    int h;
		int ammount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of bank accounts:");
		int n=sc.nextInt();
		info ob[]=new info[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new info();
		}
		for(i=0;i<n;i++)
		{
			ob[i].read();
		}
		while(true)
		{
		System.out.println("enter the choice:");
		System.out.println("1)display\n2)bank balance\n3)Withdrawal\n4)Deposit");
		int ch=sc.nextInt();
		if(ch==1)
		{    System.out.println("Name:\tAccount number:\tBalance:\n");
			for(i=0;i<n;i++)
			{
				ob[i].display();
			}
		}
		if(ch==2)
		{   i=0;
			int j=0;
			System.out.println("enter the account number to check the balance:");
			int m=sc.nextInt();
			while(j<n)
			{
				if(ob[i].accnum==m)
				{
					System.out.println("bank balance:"+ob[i].balance);
					break;
				}
				else
				{
					i++;
					j++;
				}
			}
		}
		if(ch==3)
		{   i=0;
			System.out.println("enter the account number to make the withdrawal:");
			int c=sc.nextInt();
			System.out.println("enter the amount withdraw:");
			ammount=sc.nextInt();
			h=0;
			while(h<n)
			{
				if(ob[i].accnum==c)
				{
					if(ob[i].balance<ammount)
					{
						System.out.println("NOT ENOUGH MONEY\n");
						break;
					}
					else
					{
						ob[i].balance=ob[i].balance-ammount;
						break;
					}
				}
				else
				{
					i++;
					h++;
				}
			}
		}
		if(ch==4)
		{   
	        i=0;
	        h=0;
			System.out.println("enter the account no. to deposit the money:");
			int f=sc.nextInt();
			System.out.println("enter the ammount to deposit:");
			ammount=sc.nextInt();
			while(h<n)
			{
				if(ob[i].accnum==f)
				{
					ob[i].balance=ob[i].balance+ammount;
					break;
				}
				else
				{
					i++;
					h++;
				}
			}
		}
		}
	}
}


class info
{
	String name;
	int accnum;
	int balance;
	
	public void read()
	{   
	    Scanner io=new Scanner(System.in);
		System.out.println("enter the name of the acount holder:");
		name=io.next();
		System.out.println("enter the account number:");
		accnum=io.nextInt();
		System.out.println("enter the bank balance:");
		balance=io.nextInt();
	}
	
	public void display()
	{   
		System.out.print(name);
		
        System.out.print("\t"+accnum);
		
		System.out.print("\t"+balance);
		
		System.out.print("\n");
		
	}
}
	  
