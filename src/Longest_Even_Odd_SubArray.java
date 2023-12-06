public class Longest_Even_Odd_SubArray
{

    public static void main(String args[])
    {
        int arr[]={10,12,8,4};
        int res=1;
        int curr=1;
        for(int i=0;i<=arr.length-2;i++)
        {
            if((arr[i]%2==0 && arr[i+1]%2==1)|| (arr[i]%2==1 && arr[i+1]%2==0))
            {
                res++;
                curr = Math.max(res, curr);
            }
            else
            {

                res=1;

            }
        }


        System.out.println(curr);



    }
}
