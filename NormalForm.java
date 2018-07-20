import java.util.Scanner;
class NoOfUnions
{
	int m;
	Scanner sc = new Scanner(System.in);
	public int noOfUnions()
	{
		System.out.println("Enter the number of unions of interval: ");
		m = sc.nextInt();
		return m;
	}
}
class NoOfClosedIntervals
{
	int r, a, b;
	int m = 0;
	Scanner sc = new Scanner(System.in);
	public int noOfClosedIntervals() 
	{
		System.out.println("Enter the number of closed intervals for union " + (m+1) + ": " );
		r = sc.nextInt();
		return r;
	}
	public int ULBound()
	{
		int[][] arr = new int[m][r];
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<r; j++) 
			{
				System.out.println("Enter the lower bound of interval " +(j+1) + ": ");	
				a = sc.nextInt();
				System.out.println("Enter the upper bound of interval " +(j+1) + ": ");
				b = sc.nextInt();
			}
		}
		return b;
	}
	public void compute() 
	{
		
	}
}
class output
{
	
}

public class NormalForm 
{
	public static void main(String[] args) 
	{
	NoOfUnions obj1 = new NoOfUnions();
	obj1.noOfUnions();
	NoOfClosedIntervals obj2 = new NoOfClosedIntervals();
	obj2.noOfClosedIntervals();
	obj2.ULBound();
	}

}
