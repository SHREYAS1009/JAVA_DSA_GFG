public class majority_element1
{
    public static void main(String args[])
    {
        int arr[]={8,8,6,6,8,6,8,8,7,8};
        int res=0,count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count==0)
            {
                res=i;
                count=1;
            }

        }
        count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[res])
                 count++;
        }

        if(count>arr.length/2)
             System.out.println(arr[res]);
        else
              System.out.println(-1);



    }
}
