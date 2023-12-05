import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(check(27));
    }
    public static boolean check(int n)
    {
        Scanner sc = new Scanner(System.in);

        if(n==1||n==2||n==3)
             return true;
        for(int k=2;k<Math.sqrt(n);k++)
        {
            if(n%k==0)
                 return false;
        }

        return true;

    }
}