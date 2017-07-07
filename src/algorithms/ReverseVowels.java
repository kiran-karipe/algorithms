import java.util.Arrays;

public class ReverseVowels {
	
	public static String reverseVowels(String s) {
		char[] c = {'a','e','i','o','u'};
		char temp;
		char[] d = s.toCharArray();
		for(int i=0;i<s.length()/2;i++) {
			for(int j=s.length()-1;j>=s.length()/2;j--) {
				for(int k=0;k<c.length;k++) {
				if(d[i]==c[k] ) {
					if( d[j]==c[k]) {
					 temp = d[i];
					  d[i] = d[j];
					  d[j] = temp;
					}
				}
				}
			}
		}
		return Arrays.toString(d);
	}
	
	public static void main(String[] args) {
		System.out.println("String is " + reverseVowels("karipe"));
	}
}
