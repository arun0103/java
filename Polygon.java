class Polygon
{
  Point [] a = new Point[5];
	
	public Polygon (Point []arr)
  {
		a = arr;
	}
	
	public double perimeter ()
	{
		int i, j;
		double perimeter = 0;
		for (i=0,j=1;i<5;i++,j++)
		{
			if (j==5)
				j=0;
			perimeter += (Math.sqrt((a[i].x-a[j].x)*(a[i].x-a[j].x)+(a[i].y-a[j].y)*(a[i].y-a[j].y)));
	
		}
		return perimeter;
	} 

};

