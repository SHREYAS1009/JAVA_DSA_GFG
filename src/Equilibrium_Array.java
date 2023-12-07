public class Equilibrium_Array
{

    public static void main(String args[])
    {
        int arr[]={3,4,8,-9,20,6};
        int res=0;
        int lsum;
        boolean flag=true;
        lsum=0;
        for(int i=0;i<arr.length;i++)
            res+=arr[i];

        for(int i=0;i<arr.length;i++)
        {
            res -= arr[i];
            if (lsum == res)

            {
                flag = true;
                break;
            }
            lsum+=arr[i];

        }
        System.out.println(flag);
    }
}
