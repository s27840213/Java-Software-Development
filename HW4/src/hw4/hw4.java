package hw4;
import java.util.Scanner;
import java.text.DecimalFormat;
public class hw4 {

	public static void main(String[] args) {
	Scanner keyb = new Scanner(System.in);
	DecimalFormat form = new DecimalFormat("#.##");
	double n,guess,r=0,rate=0.01;
	n = keyb.nextDouble();
	guess = n/2;
	while(((guess - (guess+r)/2)/guess)>rate)
	{
		r = n/guess;
		guess = (guess+r)/2;
	}
	System.out.print(form.format(guess));
	keyb.close();
	}

}
