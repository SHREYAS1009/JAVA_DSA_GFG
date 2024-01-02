import java.util.*;
public class palindrome
{    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check(n));
    }

    static int check(int n)
    {
        if(n<9)
            return n;
        return (check(n/10))+n%10;
    }
}
