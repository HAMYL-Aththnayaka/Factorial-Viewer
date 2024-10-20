//find the factorial of a number using for loop and while loop

import java.util.Scanner;
public class factorial{
	public static void main(String args[]){
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter Value: ");
				int Num=reader.nextInt();
				int sum =1;
				if(Num==0)
					System.out.println("Invalid");
				else
				for (int i=1; i<=Num; i++){
				sum *=i;
					
				}
					System.out.println(sum);
	}
}

		