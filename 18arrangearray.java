class arrangearray18{
 public static void main(String arg[]){
     int z=1;

       int a[][]=new int[4][3];

        for(int x=0; x<4; x++)
        {
          for(int y=0; y<3; y++)
 		{
 		a[x][y]=z;
		z++;
		}
	}
//print array

  for(int q=0; q<4; q++)
     {
       for(int w=0; w<3; w++)
	{
	System.out.print(a[q][w]+" ");
	}
	System.out.println();
	}
    }
}
		