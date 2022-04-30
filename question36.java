//Write a Java program to compute the distance between two points on the surface of earth.


public class question36 {

	public static void main(String arg[])
	{
            int x1,x2,y1,y2;
	    double dis;
	    x1=1 ; y1=1 ; x2=4 ; y2=4 ; 
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("\n distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") = "+dis);

	}

}