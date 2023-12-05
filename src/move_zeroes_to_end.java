public class move_zeroes_to_end
{
    public static void main(String[] args)
    {
        int arr[]={0,0,10,20,0,30,23,9};
        int n=0,res=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {


                if (arr[i] != 0)
                {
                    arr[n] = arr[i];
                    n++;
                }
                /*else
                {
                    arr[res] = 0;
                    res--;
                }*/

        }
        for(int i=n;i<arr.length;i++)
        {
            arr[i]=0;
        }


        for(int a:arr)
            System.out.print(a+" ");
    }
}
