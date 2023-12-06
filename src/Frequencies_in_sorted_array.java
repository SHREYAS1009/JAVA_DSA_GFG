import static java.lang.System.*;
public class Frequencies_in_sorted_array
{
    public static void main(String args[])
    {

        int arr[] = {10,10,20,20};
        //boolean flag=true;
        int count=1;
        for (int i=1;i<arr.length;i++)
        {

            if (arr[i] == arr[i - 1])
                count++;

            else
            {
                System.out.print(arr[i-1]+"->"+count);
                System.out.println();
                count = 1;
            }

        }

        System.out.print(arr[arr.length-1] + "->"+count);

    }
}