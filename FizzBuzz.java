
import java.util.Scanner;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("整数を入力してください");
		int number =sc.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			if(i%3<=0&&i%5<=0)
			{
				System.out.print("FizzBuzz");
			}else if(i%3<=0)
			{
				System.out.print("Fizz");
			}else if(i%5<=0)
			{
				System.out.print("Buzz");
			}else 
			{
				System.out.print(i);
			}
			System.out.print(",");
			sc.close();
		}
	}
	
}