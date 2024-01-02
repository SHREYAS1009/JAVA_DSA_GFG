/*
arr[]={2,3,10,6,4,8,1}
op 8
since arr[j]-arr[i] is maximum (10-2) and j>i


 */
public class maximum_differnce
{
    public static void main(String args[])
    {
        int arr[]={2,3,10,6,4,8,1};
        int min=arr[0];
        int res=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++)
        {
           res=Math.max(res,arr[i]-min);
           min=Math.min(min,arr[i]);

            /*else
            {
                min=arr[i];
                res=Math.max(res,min);
            }

             */
        }

        System.out.println(res);
    }
}
