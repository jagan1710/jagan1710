import java.util.Scanner;
class EvenorOdd 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("The Number is Even :"+n); 
		}
		else
			System.out.println("The Number is odd :"+n); 
	}
}
