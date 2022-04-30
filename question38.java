//Write a Java program to count the letters, spaces, numbers and other characters of an input string.


import java.util.Scanner;
public class question38 {
    
 public static void main(String[] args) {

		String test = "Write a Java program to count the letters, spaces, numbers and other characters of an input string.";
		count(test);

	}

	public static void count(String x){

		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter ++ ;
			}
			else if(Character.isDigit(ch[i]))
			{
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i]))		
			{
				space ++ ;
			}
			else
			{
				other ++;
			}
		}

		System.out.println("\nWrite a Java program to count the letters, spaces, numbers and other characters of an input string.");
		System.out.println("\nletter: " + letter);
		System.out.println("\nspace: " + space);
		System.out.println("\nnumber: " + num);
		System.out.println("\nother: " + other);

      }


}