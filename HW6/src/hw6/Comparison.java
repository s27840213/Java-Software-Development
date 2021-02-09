package hw6;

public class Comparison implements IOperation{
	
	public String perform(String num1, String num2) {


		int len1 = num1.length();
		int len2 = num2.length();
		int i=0;
		String result = "";
		
		if(len1<len2){
			result = "-1";
		}else if(len1>len2){
			result = "1";
		}else if(num1.equals(num2)){
			result = "0";
		}else{  
			for(i=0;i<len1;i++){
				if(num1.charAt(i) > num2.charAt(i)) {result = "1"; break;}
				else if(num1.charAt(i) < num2.charAt(i)) {result = "-1"; break;}
			}
		}
		

		
		return result;
	}

}
