/*
 * 1)Write a program to accept choice from the user and display the output
 * 1.Arithmetic operator
 * 2.Logical Operator
 * 3.Relational Operator
 * 4.Bitwise Operator
 * 5.Conditional Operator
 * 6.Assignment Operator
 */
package Practicecode;
import java.util.Scanner;

public class OperatorsOperation {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);//To accept number from user
			int num1,num2,choice,result,choice2;
			System.out.println("Enter first value=");
			num1=sc.nextInt();
			System.out.println("Enter second value=");
			num2=sc.nextInt();
			
			System.out.println("Enter your choice:\n1:Arithmatic Operator\n2:Logical Operator\n3:Relational Operator\n4:Bitwise Operator\n5:Conditional Operator\n6:Assignment Operator");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Arithmatic Operator ");
				
				 //Addition
				result=num1+num2;
				System.out.println("Addition is:"+result);
				//Subtraction
				result=num1-num2;
				System.out.println("Subtraction is:"+result);
				//Multiplication
				result=num1*num2;
				System.out.println("Multiplication is:"+result);
				//Division
				result=num1/num2;
				System.out.println("Division is:"+result);
				//Modulus
				result=num1%num2;
				System.out.println("Remender is:"+result);
				break;
			case 2:System.out.println("Logical Operator ");
			        //Logical Operator &&
			        System.out.println(num1==num2 && num1!=num2);	
			        //Logical Operator ==
			        System.out.println(num1==num2 || num1!=num2);
			        //Logical Opearator !
			        System.out.println(!(num1>num2));
			        break;
			case 3:System.out.println("Relational Operator ");
					//Relational Operator ==
					System.out.println(num1==num2);
					//Relational Operator !=
					System.out.println(num1!=num2);
					//Relational Operator >
					System.out.println(num1>num2);
					//Relational Operator <
					System.out.println(num1<num2);
					//Relational Operator >=
					System.out.println(num1>=num2);
					//Relational Operator <=
					System.out.println(num1<=num2);
					break;
			case 4:System.out.println("Bitwise Operator ");
					//Bitwise &(and) operator
						result=num1 & num2;
						System.out.println("After "+ num1+"&"+num2+" opreration result is:"+result);
						//Bitwise |(OR) operator
						result=num1 | num2;
						System.out.println("After "+ num1+"|"+num2+" opreration result is:"+result);
						//Bitwise ^(XOR) operator
						result=num1 ^ num2;
						System.out.println("After "+ num1+"^"+num2+" opreration result is:"+result);
					break;
			case 6: System.out.println("Assignment Operator");
				 System.out.print("'num1' is assign with 10 value");
	                num1 += 20;
	                System.out.print("\n'num1' is add with 20 and again assign to 'num1'"
	                        + " the value=" + num1);

	                System.out.print("\n'num2' is assign with 6.3 value");
	                num2 *= 2;
	                System.out.print("\n'num2' is multiply with 2 and again assign to 'num2'"
	                        + " the value=" + num2);
	                break;
			case 5:System.out.println("Conditinal Operator");
			 // performing conditional operator

            System.out.println("\n\nConditional Opeartor ");
            System.out.println("Types of conditional Operator\n");

            // List of conditional operator
            System.out.println("1) if\n"
                    + "2) if else\n"
                    + "3) if ifelse else\n"
                    + "4) switch\n"
                    + "Enter your choice=");
               choice2 = sc.nextInt();
              switch (choice2) {
                case 1:
                    System.out.println("Yor are in 'if' condition\n");
                    break;

                case 2:
                    System.out.println("Yor are in 'if else' condition\n");
                    break;

                case 3:
                    System.out.println("Yor are in 'if elseif else' condition\n");
                    break;

                case 4:
                    System.out.println("Yor are in 'switch' condition\n");
                    break;
                default:
                	System.out.println("Please Enter valid choice");
            }
			}

           sc.close();
	            
	   }
	}
	

