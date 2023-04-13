import java.util.Scanner;
class fibo 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int n=s.nextInt();
		int n1=0,n2=1,a=0;

		for (int i=0;i<=n ;i++ )
		{
			a=n1+n2;
			n1=n2;
			n2=a;
			System.out.print(a+" ");
		}
	}
}
