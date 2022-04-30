//Write a program in java to find the area and circumference of a circle. 

public class question11 {
 
   //private static final double radius = 7.5;

    public static void main(String[] args) 
    {

	double radius = 7.5;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("\n circumference is = " + circumference);
        System.out.println("\n\n Area is = " + area);

    }
}