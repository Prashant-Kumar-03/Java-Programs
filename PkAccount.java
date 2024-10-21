

import java.util.*;
class AccountException extends Exception
{
	AccountException(String s)
	{
		super(s);
	}

}

class Account
{
		String accno, name;
		int bal;
		Scanner sc=new Scanner(System.in);
		Account()
		{
			accno="0000";
			name="unknown";
			bal=0;	
		}

		Account(String accno,String name, int bal)
		{
			this.accno=accno;
			this.name=name;
			this.bal=bal;	
		}
		void deposite()
		{
			System.out.println("\nEnter the amount you want to deposite: ");
			int dep=sc.nextInt();
			bal+=dep;
			System.out.println("your account is credited by amount INR"+dep);
		}
		void withdraw()
		{
			System.out.println("Enter the amount you want to withdraw: ");
			int wdr=sc.nextInt();
			if(wdr>bal)
			{
				System.out.print("You have only "+bal+ " money in your account. You cannot withdraw more than this.You have to deposite some money into your account");
			}			
			else
			{	
				System.out.println("Money withdrawn");
				bal-=wdr;
			}
						
		}
		int getBalance()
		{
			return bal;
		}
		
	

}


class PkAccount
{
	public static void main(String arg[])
	{


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name1=sc.nextLine();
		System.out.println("Enter your accno: ");
		String accno1=sc.nextLine();
		Account a1=new Account(accno1,name1,0);
		//a1.withdraw();	
		a1.deposite();	
		try
		{
			if(a1.getBalance()<1000)
				throw new AccountException("your balance is less than 1000");
			else
				throw new AccountException("NICE..RICH PEOPLE, HUH!!!");
			


	
		}
		catch (AccountException me)
		{

			System.out.println(me.getMessage());	

		}
		
		
	}

}