//Write a Java program that takes five numbers as input to calculate and print the average of the numbers.


import java.util.Scanner;
 
public class question12 {
 
 public static void main(String[] args) 
{
  Scanner in = new Scanner(System.in);
   
  System.out.print("\nInput first number: ");
  int num1 = in.nextInt();
   
  System.out.print("\nInput second number: ");
  int num2 = in.nextInt();
   
  System.out.print("\nInput third number: ");
  int num3 = in.nextInt();
   
  System.out.print("\nInput fourth number: ");
  int num4 = in.nextInt();
  
  System.out.print("\nEnter fifth number: ");
  int num5 = in.nextInt();
   
   
  System.out.println("\nAverage of five numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);

 }

}