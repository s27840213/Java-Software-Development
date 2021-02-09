package hw3;

public class Calculator {
	public int mod(int a,int b)
	{
		while(a%b==0)
		{
			a=a/b;
		}
		return a;
	}
	
	public boolean isTrue(int a)
	{
		a = mod(a,2);
		a = mod(a,3);
		a = mod(a,5);
		if(a==1)
			return true;
		else
			return false;
	}
	
	public int getNum(int k)
	{
		int count = 0;
		int i = 0;
		while(count<k)
		{
			i++;
			if(isTrue(i))
				count++;
		}
		return i;
	}
}
