//2.Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
class SortDemo1
{
	public static void main(String args[])
	{
		int arr[]={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
		System.out.println("Original Array="+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays="+Arrays.toString(arr));
	}
}