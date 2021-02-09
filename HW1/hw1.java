package hw;

public class hw1 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
		{
			//the first letter is vowel(Upper&Lower cases were considered), only just add ¡§ay¡¨ to the end
			if (args[i].charAt(0)== 'a'||args[i].charAt(0)=='A' || args[i].charAt(0)== 'e'||args[i].charAt(0)=='E'  || args[i].charAt(0)=='i'||args[i].charAt(0)=='I' || args[i].charAt(0)=='o'||args[i].charAt(0)=='O' 
					|| args[i].charAt(0)== 'u'||args[i].charAt(0)=='U' ) 
			{
				args[i] = args[i].toUpperCase().charAt(0) + args[i].substring(1) + "ay";
			} 
			
			//the first letter is consonant, move the first letter to the end andappend ¡§ay¡¨.

			else 
			{
				args[i] = args[i].toUpperCase().charAt(1) + args[i].substring(2) + args[i].charAt(0) + "ay";
			}

			System.out.print(args[i]);
			
			System.out.print(" ");
			
		}
	}

}
