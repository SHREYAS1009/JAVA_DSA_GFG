public class Largest_in_array
{
    public static void main(String args[])
    {

        int arr[]={10,50,20,80,1800};
        System.out.println(check(arr));

    }
    /*static int check(int arr[])
    {
        int max=Integer.MIN_VALUE;;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }


        }

        return max;*/

       /*
          Further optimised code */

        static int check(int arr[])
        {
        int max = Integer.MIN_VALUE;
        for (int num : arr)
        {
            max = Math.max(max, num);
        }
        return max;
        }
    }


