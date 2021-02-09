package hw;
import java.util.Scanner;
import java.text.DecimalFormat;

public class hw2 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		double a = keyb.nextDouble();
		double b = keyb.nextDouble();
		double c = keyb.nextDouble();
		double ans1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
		double ans2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
		String fm = keyb.next();
		DecimalFormat myformat = new DecimalFormat(fm);
			System.out.println(myformat.format(ans1));
			System.out.print(myformat.format(ans2));
		keyb.close();
	}

}
