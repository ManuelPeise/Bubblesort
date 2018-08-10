
public class sort 
{
	boolean change=true;
	int help;
	
	public int[] sortNumbers(int[] numb)
	{
		
		while(change) {
			
			change = false;
			
			for(int i=0;i<numb.length-1;i++)
			{
				if(numb[i]>numb[i+1])
				{
					help = numb[i];
					numb[i] = numb[i+1];
					numb[i+1] = help;
					change = true;
				}
			}
			
			
			
			
			
		}
		
		return numb;
	}

}
