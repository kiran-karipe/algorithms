package algorithms;

public class ReverseString {

    public String reverseString(String s) {
            char[] str1 = new char[s.length()];
    int j=0;
            for(int i = s.length()-1; i>=0; i--) {
                    str1[j] =  s.charAt(i);
                    j++;
            }

            return new String(str1);
    }

    public static void main(String[] args) {
            ReverseString rs = new ReverseString();
            System.out.println(rs.reverseString("hello"));
    }
}

