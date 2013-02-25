import java.lang.Math;

public class Main
{
  public static void main (String args[])
	{
		Point [] arr = new Point[5];
		
		arr[0] = new Point(2,0);
		arr[1] = new Point(2,2);
		arr[2] = new Point(2,4);
		arr[3] = new Point(5,0);
		arr[4] = new Point(5,5);
	
		Polygon p1 = new Polygon(arr);
	
		double result = p1.perimeter();
		
		System.out.println("The perimeter is: "+result);
	}
	
};
