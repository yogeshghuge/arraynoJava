//5. Write a Java program to test if an array contains a specific value.

class ContainsValuePresentOrNot5
{
	public static void main(String args[])
	{
		int a[]={1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2265, 1457, 2456};
		int d=2035;
		for(int i=0; i<a.length;i++)
		{
			if(d==a[i])
			{
				System.out.println(true);
				break;
			}
		}
	}

}
		