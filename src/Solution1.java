public class Solution1 {

    public static void main(String args[])
    {
        String s="skdpnyegmds";
        boolean result=isPalindrome(s);
        //System.out.println(s);
    }

    public static boolean isPalindrome(String str)
    {
        // Write your code here.

        str=str.replaceAll("[^a-zA-Z0-9]","");
        str=str.toLowerCase();
        boolean result;
        result=compute(str,0,str.length()-1);
        System.out.println(result);
        return result;

    }

    public static boolean compute(String s,int beg,int len)
    {
        System.out.print(beg+" "+len+" ");
        if(beg<len && s.charAt(beg)==s.charAt(len))
        {

            compute(s, beg + 1, len - 1);
        }

        /*if(beg<len && s.charAt(beg)!=s.charAt(len))
        {
            return false;
        }

        else if(beg>len && s.charAt(beg)!=s.charAt(len))
        {
            return false;
        }
        else
             return true;*/

        return beg >= len || s.charAt(beg) == s.charAt(len);
    }
}