import java.util.Scanner;

public class input 
{

	Scanner sc = new Scanner(System.in);
	
	public int[] getNumbers()
	{
		int[] numbers= new int[10];
		int i=0;
		
		System.out.println("Bitte geben Sie Ihre Zahlen ein!");
		
		do {
			
		
		System.out.print("Zahl: ");
		
		numbers[i]=sc.nextInt();
		
		i++;
		}while(i<10);
		
		return numbers;
	}
}
