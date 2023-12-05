import java.util.*;
public class SecondLargest
{
    public static void main(String args[])
    {

        int arr[]={107,107,107,109};
        System.out.println(check(arr));

    }

    static int check(int arr[])
    {
        int diff=-1;
        int n[]=new int[arr.length];
        System.arraycopy(arr,0,n,0,arr.length);
        Arrays.sort(n);
        int max=n[arr.length-1];
       // System.out.println("max:"+max);
        int min=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<arr.length;i++)
        {

            //if(arr[i]!=max)

             if(Math.abs(arr[i] - max)<min && arr[i]!=max)
            {
                min =Math.abs(arr[i] - max);
                pos=i;

                //System.out.print(min+" ");

            } }

       if(min!=Integer.MAX_VALUE)
            return pos;
       else
           return -1;

    }
}
