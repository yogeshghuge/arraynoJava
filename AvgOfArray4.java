//4. Write a Java program to calculate the average value of array elements.

class AvgOfArray4
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,94,33,1,234,1,33,22,244,3,45};
		double sum=0,avg=0;
		for(int i=0; i<a.length;i++)
			sum+=a[i];
		avg=sum/a.length;
		System.out.println("Sum of array=" +sum);
		System.out.println("Avg of array=" +avg);
	}
}
