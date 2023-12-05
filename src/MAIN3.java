public class MAIN3
{
    public static void main(String[] args)
    {
        int n,m;
        n=21;
        m=27;
        while(n!=0 || m!=0)
        {
            if (n == 0)
            {
                System.out.println("n is smaller");
                break;
            }
            else if (m == 0)
            {
                System.out.print("m is smaller");
                break;
            }
            else
                 m--;
                  n--;
        }

    }
}
