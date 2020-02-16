package com.vnrvjiet.Hruthika.Calculators;
import java.util.*;
import java.util.InputMismatchException;

import com.vnrvjiet.Hruthika.Calculators.Operations.Addition;
import com.vnrvjiet.Hruthika.Calculators.Operations.Division;
import com.vnrvjiet.Hruthika.Calculators.Operations.Multiplication;
import com.vnrvjiet.Hruthika.Calculators.Operations.Subtraction;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		int Selection=0;
		while(Selection==0)
		{
			
			System.out.println("Enter the option");
			System.out.println("1.Addtion  2.Subtraction  3.Multiplication  4.Division");
			int Option=sc.nextInt();
			if(!(Option >=1 && Option <=4))
				System.out.println("You Entered Wrong Option.... Enter a Valid option");
			
			else
			{
				try
				{
			System.out.println("enter two numbers");
			double number1=sc.nextDouble();
			double number2=sc.nextDouble();
			Addition add=new Addition();
			Subtraction sub=new Subtraction();
			Multiplication mul=new Multiplication();
			Division div=new Division();
			switch(Option)
			{
			case 1:double AddResult=add.AddOp(number1, number2);
			     System.out.println("Your Result is !.... : "+ AddResult);
			   break;
			case 2:double SubResult=sub.SubOp(number1, number2);
			 System.out.println("Your Result is !.... : "+ SubResult);
			   break;
			case 3:double MulResult=mul.MulOp(number1, number2);
			 System.out.println("Your Result is !.... : "+ MulResult);
			break;
			case 4:double DivResult=div.DivOp(number1,number2);
			 System.out.println("Your Result is !.... : "+ DivResult);
			break;   
			}
			}
				catch(InputMismatchException e)
				{
					System.out.println("Invalid Input.......Please Enter Numbers Only");
					
				}
			}
			System.out.println("Do You Want To Continue The Operations ......Press 0 ");
			 Selection=sc.nextInt();
		}
		System.out.println("You Quit the Operations........."); 
    }
}
