package algorithms;

public class NumberComplement {

	public int findComplement(int num) {
		String binaryString = Integer.toBinaryString(num);
		char[] ch=binaryString.toCharArray();
		for(int i=0; i<binaryString.length(); i++) {
			if(binaryString == "0") {
				return 1;
			}
			else if(binaryString == "1") {
				return 0;
			} else {
				if(ch[i] == '0') {
					ch[i] = '1';
				} else {
					ch[i] = '0';
				}
			}
		}
		binaryString = new String(ch);
		num = Integer.parseInt(binaryString, 2);
		return num;
	}
	
	public static void main(String args[]) {
		NumberComplement nc = new NumberComplement();
		int num = nc.findComplement(4);
		System.out.println(num);
	}
}
