public class check_Array_sort {
    public static void main(String args[]) {

        int arr[] = {100,20,200};
        boolean flag=true;
        for (int i = 0;i<=arr.length-2;i++)
        {

            if(arr[i]>arr[i+1])
            {
               flag=false;
                break;
            }

        }
        System.out.println(flag);

    }
}