package algorithms;

public class UserSolution {
    public int almost_palindromes(String str) {
        char[] ch = str.toCharArray();
        int begin=0;
        int end=ch.length-1;
        char temp;
        while(end>begin){
            temp = ch[begin];
            ch[begin]=ch[end];
            ch[end] = temp;
            end--;
            begin++;
        }
        
        String str2 = new String(ch);
        
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
               
        return count;
    }
    
    public static void main(String args[]) {
    	UserSolution us = new UserSolution();
    	String str = "abba";
    	System.out.println(us.almost_palindromes(str));
    }
}
