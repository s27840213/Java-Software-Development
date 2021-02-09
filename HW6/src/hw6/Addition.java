package hw6;

public class Addition implements IOperation{

	public String perform(String num1, String num2) {
		int i;
		int len1 = num1.length();
		int len2 = num2.length();
		int len3 = 0;
		char[] c1 = num1.toCharArray();
		char[] c2 = num2.toCharArray();
		int[] i1 = new int[300];
		int[] i2 = new int[300];
		int carry=0;
		String ans="";
		
		if(len1>len2){
			len3 = len1+1;
		}else {
			len3 = len2+1;
		}

		for(i=0; i<len1; i++){
			i1[len1-i-1]= 0;
			i1[len1-i-1]=Integer.parseInt(String.valueOf(c1[i]));
		}
		
		for(i=0; i<len2; i++){
			i2[len2-i-1]= 0;
			i2[len2-i-1]=Integer.parseInt(String.valueOf(c2[i]));
		}

		for(i=0;i<len3;i++){
			ans = String.valueOf((i1[i]+i2[i]+carry)%10)+ans;
			carry = (i1[i]+i2[i]+carry)/10;
		}
		
		if(ans.startsWith("0"))
			ans = ans.substring(1);


		
		return ans;
	}

}
