
public class sliding_window
{
    public static void main(String args[])
    {
        int sum=0;


        int arr[]={25,25,25,19,19,19};
        int k=3;
        for(int i=0;i<k;i++)
            sum+=arr[i];
        int res=sum;
        int maxsum=sum;
        System.out.println(maxsum);
       /* for(int i=k;i<arr.length;i++)
        {
            maxsum+=arr[i]-arr[i-k];
            res=Math.max(maxsum,res);
        }*/

        for(int i=1;i+k-1<arr.length;i++)
        {
            maxsum=maxsum-arr[i-1]+arr[i+k-1];
           // System.out.println(i+"->"+maxsum);
            res=Math.max(maxsum,res);
        }
        System.out.println("Sliding window output="+res);




    }
}
