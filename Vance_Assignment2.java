/**
* Name: Jayden Vance
* File: Assignment 2
* Description: Book Entry Program
*/
import java.util.Scanner;
public class Vance_Assignment2

{

	public static void main(String[] args)

	{
		System.out.println("********************************************************");
		System.out.println("* Welcome to the Daily Book Inventory Program! *");
		System.out.println("********************************************************");
		Scanner input = new Scanner(System.in);
		Scanner ch = new Scanner(System.in);

		char choice,choice1;
		int sum=0;
		int re = 0;
		int check=0;
		int total=0;
		
// Enter saving amount
	do
		{      
	  	System.out.println("Enter the first 12 digits of an ISBN-13 as a String:");
	  	String s = input.nextLine();

  
	  	while (s.length() != 12)
		{
		System.out.println(s + " is an invalid input Try Again!");
		System.out.println("Enter the first 12 digits of an ISBN-13 as a String:");
		s = input.nextLine();
		}

	for (int i = 0; i < s.length(); i++)		
		{
		if ((i + 1) % 2 == 0)
			{
			sum += s.charAt(i) - 48;
			} 
		else
			{
			sum += 3 * (s.charAt(i) - 48);
			}
		}
			sum = (10 - sum%10)%10;
			System.out.println("The ISBN-13 number is " +s + sum);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Enter 'R' for return or 'C' for check out: ");
			choice=ch.next().charAt(0);
		
    if(choice=='R'|| choice=='r')
    	{
    	re=re+1;
    	total=total+1;
    	}
    if(choice=='C'|| choice=='c')
    	{
    	check=check+1;
    	total=total+1;
    	}
     		System.out.println("*********************************************************************");
     		System.out.println("* Daily Book Inventory *");
     		System.out.println("*********************************************************************");
     		System.out.println("Number of books returned:\t"+re);
     		System.out.println("Number of books cehecked out:\t"+check);
     		System.out.println("Total number of books processed:\t"+total);
     		System.out.println("*********************************************************************");
     		System.out.println("Enter 'Y' to continue,'N' to quit: ");
     		choice1=ch.next().charAt(0); 

  		}
			while(choice1=='Y'||choice1=='y');
    
	  }
}
