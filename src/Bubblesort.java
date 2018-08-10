
public class Bubblesort {

	
	static input in = new input();
	static sort so = new sort();
	static int[] unsortNumbers = new int[10];
	static int[] sortedNumbers = new int[10];
	
	public static void main(String[] args) 
	{
	System.out.println("Bubblesort\n");	
	
	unsortNumbers = in.getNumbers();
	sortedNumbers = so.sortNumbers(unsortNumbers);
	
	for(int i=0;i<sortedNumbers.length;i++)
	{
		System.out.print(sortedNumbers[i]+", ");
	}
	System.out.println("\n\nProgrammende");

	}

}
