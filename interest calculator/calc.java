import java.util.Scanner;
import java.lang.*;
abstract class Account
{
	double intrate,amount=0; 
	double calculateinterest() 
	{
     return 0; 
}
} 
class FDAccount extends Account
{ 
	int days,age; double amt,famt=0; 
	double calculateinterest() 
	{
    System.out.println("enter the FD amount: "); 
    Scanner s=new Scanner(System.in); 
    amt=s.nextDouble(); 
    System.out.println("enter the days(days<=365): "); 
    days=s.nextInt(); 
    System.out.println("enter the age: "); 
    age=s.nextInt(); 
    if(amt<10000000) 
    {
      if(age>60) 
{
if(days>=7&&days<=14) 
{
	intrate=5.00/100; amount=amt*intrate;
System.out.println("interest gained: "+amount);
} 
else if(days>=15&&days<=29)
{
	intrate=5.25/100; amount=amt*intrate; 
	System.out.println("interest gained: "+amount); 
	} 
else if(days>=30&&days<=44)
{
	intrate=6.00/100; amount=amt*intrate; 
	System.out.println("interest gained: "+amount);
	}
else if(days>=45&&days<=60)
{
	intrate=7.50/100; amount=amt*intrate; 
	System.out.println("interest gained: "+amount);
	}
else if(days>=61&&days<=184) 
{
	intrate=8.00/100; 
	amount=amt*intrate;
	System.out.println("interest gained: "+amount);
	}
else if(days>=185&&days<=365) 
{
	intrate=8.50/100; 
	amount=amt*intrate; 
	System.out.println("interest gained: "+amount);
	}
else
{
	System.out.println("invalid data"); 
	}
	}
      else 
      {
	if(days>=7&&days<=14) 
	{
		intrate=4.50/100; 
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else if(days>=15&&days<=29)
	{
		intrate=4.75/100;
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else if(days>=30&&days<=44) 
	{
		intrate=5.50/100;
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else if(days>=45&&days<=60) 
	{
		intrate=7.00/100;
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		} 
	else if(days>=61&&days<=184)
	{
		intrate=7.50/100; 
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else if(days>=185&&days<=365) 
	{
		intrate=8.00/100; 
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else 
	{
	System.out.println("invalid data"); 
	} 
	}
	}
    else 
    {
	if(days>=7&&days<=14) 
	{
		intrate=6.50/100; 
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else if(days>=15&&days<=44)
	{
		intrate=6.75/100;
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount); 
		} 
	else if(days>=45&&days<=60)
	{
		intrate=8.00/100; 
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		} 
	else if(days>=61&&days<=184) 
	{
		intrate=8.50/100; 
		amount=amt*intrate; 
		System.out.println("interest gained: "+amount);
		}
	else if(days>=185&&days<=365) 
	{
		intrate=10.00/100;
		amount=amt*intrate;
		System.out.println("interest gained: "+amount);
		}
	else 
	{
		System.out.println("invalid data"); 
		}
	} 
    return 0; 
    }
		}
class SBAccount extends Account
{ 
	double calculateinterest() 
	{
		double amt;
		int a;
		System.out.println("enter the value '1' if you are NRI else enter '0' : ");
		Scanner s=new Scanner(System.in); 
		a=s.nextInt(); 
		System.out.println("enter the saving amount: "); 
		amt=s.nextDouble(); 
		if(a==1)
		{
		intrate=6; 
		amount=amt*intrate/100; 
		System.out.println("interest gained: "+amount);
		}
		else
		{
		intrate=4; 
		amount=amt*intrate/100; 
		System.out.println("interest gained: "+amount);
		} 
		return 0; 
		}
		}
class RDAccount extends Account
{
	int months,age;
	double monamt,famt,n=4,m=12;
	double calculateinterest() 
	{
			System.out.println("enter the monthly amount: ");
			Scanner s=new Scanner(System.in); 
			monamt=s.nextDouble(); 
			System.out.println("enter the number of months(in the multiple of 3): ");
			months=s.nextInt(); 
			System.out.println("enter the age: ");
			age=s.nextInt(); 
			if(age>60) 
			{
				switch(months)
				{
				case 6: {intrate=8.00/100;
				for(int i=0;i<6;i++) 
				{
					amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
					months=months-1;
					}
				months=6; 
				famt=amount-monamt*months;
				System.out.println("interest gained: "+famt); 
				break;
				}
				case 9: 
				{
					intrate=8.25/100; 
					for(int i=0;i<9;i++)
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m); 
						months=months-1;
						}
					months=9;
					famt=amount-monamt*months;
					System.out.println("interest gained: "+famt);
					break;
					}
				case 12:
				{
					intrate=8.50/100;
				for(int i=0;i<12;i++)
				{
					amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
					months=months-1;
					}
				months=12;
				famt=amount-monamt*months; 
				System.out.println("interest gained: "+famt);
				break;
				}
				case 15:
				{
					intrate=8.75/100;
				for(int i=0;i<15;i++) 
				{
					amount=amount+monamt*Math.pow(1+intrate/n,n*months/m); 
					months=months-1;
					}
				months=15;
				famt=amount-monamt*months;
				System.out.println("interest gained: "+famt);
				break;
				}
				case 18:
				{
					intrate=9.00/100;
					for(int i=0;i<18;i++) 
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
						months=months-1;
						}
					months=18;
					famt=amount-monamt*months;
					System.out.println("interest gained: "+famt);
					break;
					}
				case 21: 
				{
					intrate=9.25/100;
					for(int i=0;i<21;i++) 
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
						months=months-1;
						}
					months=21;
					famt=amount-monamt*months;
					System.out.println("interest gained: "+famt); 
					break;
					}
				default:
					
					System.out.println("invalid input"); 
					}
			} 
			else 
			{
			switch(months)
			{
			case 6:
			{
				intrate=7.50; 
				for(int i=0;i<6;i++) 
				{
					amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
					months=months-1;
					}
				months=6;
				famt=amount-monamt*months;
				System.out.println("interest gained: "+famt);
				break;
				} case 9: 
				{
					intrate=7.75/100; 
					for(int i=0;i<9;i++)
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
						months=months-1;
						}
					months=9; 
					famt=amount-monamt*months; 
					System.out.println("interest gained: "+famt);
					break;
					}
				case 12:
				{
					intrate=8.00/100; 
					for(int i=0;i<12;i++) 
					{amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
					months=months-1;
					}
					months=12; 
					famt=amount-monamt*months;
					System.out.println("interest gained: "+famt); 
					break;
					} 
				case 15: 
				{
					intrate=8.25/100;
					for(int i=0;i<15;i++)
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
						months=months-1;
						}
					months=15;
					famt=amount-monamt*months;
					System.out.println("interest gained: "+famt); 
					break;
					}
				case 18: 
				{
					intrate=8.50/100; for(int i=0;i<18;i++) 
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
						months=months-1;
						} 
					months=18; 
					famt=amount-monamt*months; 
					System.out.println("interest gained: "+famt);
					break;
					} 
				case 21: 
				{
					intrate=8.75/100; 
					for(int i=0;i<21;i++) 
					{
						amount=amount+monamt*Math.pow(1+intrate/n,n*months/m);
						months=months-1;
						}
					months=21; 
					famt=amount-monamt*months;
					System.out.println("interest gained: "+famt); 
					break;
					}
				default: 
				{System.out.println("invalid input");
				}
				}
			} 
			return 0;
			} 
	}
public class calc
{
	
				public static void main(String[] args) 
				{
					// TODO Auto-generated method stub int b; int ch; do 
					{
				System.out.println("select the option: "); 
				System.out.println("1. interest calculator-SB"); 
				System.out.println("2. interest calculator-FD");
				System.out.println("3. interest calculator-RD"); 
				System.out.println("4. Exit");
				Scanner s=new Scanner(System.in);
				int b = s.nextInt(); 
				switch (b) 
				{
				case 1:
				{
					SBAccount s1=new SBAccount();
					
					s1.calculateinterest(); 
					break;
				}
					
				case 2: 
				{
					FDAccount f1=new FDAccount(); 
					f1.calculateinterest();
					break;
					
					}
				case 3: 
				{
					RDAccount r1=new RDAccount(); 
					r1.calculateinterest();
					break;
					}
				case 4:
				{
					System.out.println("Interest Calculator Exited!");
					}
				
					default: 
					{
						System.out.println("invalid input!");
						} 
					} 
				System.out.println("if want to continue enter '1' else '0' : ");
				int ch = s.nextInt();
					}
					int ch;
					while(ch==1); System.out.println("Interest Calculator Exited!");
					}
}