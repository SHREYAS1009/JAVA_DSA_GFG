public class count_1_in_binary_array
{
    public static void main(String args[])
    {
        //int arr[]={1,0,1,1,1,1,0,1,1};
        int arr[]={0,0,0,0,01,0,1,0,1,1,1,1,1,1};
        int count,res;
        count=res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
                count++;
            else if(arr[i]!=1)
            {
                res = Math.max(res, count);
                count = 0;
            }


        }

        System.out.println(Math.max(res, count));
    }
}
