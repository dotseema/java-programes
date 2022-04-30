//Write a Java program to compute the area of a hexagon.




public class question34 { 

    // Create a function for calculating
    // the area of the hexagon.
    public static double hexagonArea(double s) 

    {
        return ((3 * Math.sqrt(3) * 
                (s * s)) / 2);
    } 
          
    // Driver Code
    public static void main(String[] args) 
    {     
        // Length of a side
        double s = 8;      
        System.out.print("\n\n Area: " + 
                          hexagonArea(s) );
    }
}