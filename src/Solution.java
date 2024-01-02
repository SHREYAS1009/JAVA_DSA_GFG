import java.util.ArrayList;

public class Solution {

    public static void main(String args[]) {
        String s = "zzxzz";
        boolean result = compute(s,0,s.length()-1);
        System.out.println(result);
    }

    /*public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        boolean result = compute(str, 0, str.length() - 1);
        //System.out.println(result);
        return result;
    }
*/
    public static boolean compute(String s, int beg, int len) {
        //System.out.print(beg + " " + len + " ");

        //System.out.println("size:"+al.size());
        if (beg < len && s.charAt(beg) == s.charAt(len)) {
            return compute(s, beg + 1, len - 1);
        }

        return beg >= len || s.charAt(beg) == s.charAt(len);
    }
}
