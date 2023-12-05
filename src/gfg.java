//{ Driver Code Starts
//Initial Template for Java
public class gfg
{
public static void main(String args[])
        {

        int arr[]={10,50,20,80,180};
        System.out.println(check(arr));

        }
static int check(int arr[])
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

        return index;
        }

        }
