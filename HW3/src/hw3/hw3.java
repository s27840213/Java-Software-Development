package hw3;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		String input;
		int x,y;
		boolean result_x;
		int result_y;
		input = keyb.nextLine();
		Calculator cal = new Calculator();

		if(input.startsWith("X"))
		{
			x = Integer.valueOf(input.substring(2));
			result_x = cal.isTrue(x);
			System.out.print(result_x);
		}
		else if(input.startsWith("Y"))
		{
			y = Integer.valueOf(input.substring(2));
			result_y = cal.getNum(y);
			System.out.print(result_y);
		}
		keyb.close();
	}

}
