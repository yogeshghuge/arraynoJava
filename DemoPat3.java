/*3. Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - - */
import java.util.*;
class DemoPat3
{
	public static void main(String args[])
	{
		int a[][]=new int[10][10];
		
		for(int i=0; i<10;i++)
		{
			int c=1;
			for(int j=0; j<10;j++)
			{
				System.out.print(a[i][j]=c);
				c++;
			}
		System.out.println();
		}
			}
}