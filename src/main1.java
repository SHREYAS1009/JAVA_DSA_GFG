import java.util.Scanner;

import java.util.*;
public class main1
{

    public static void main(String[] args)
    {
        /*int p,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and root");
        p=sc.nextInt();
        n=sc.nextInt();
        System.out.println(check(p,n));*/

        int arr[]={1,2,3,4,5};
        int k=3;
        int rotated[]=check(arr,k);
        for(int i=0;i<arr.length;i++)
            System.out.print(rotated[i]+" ");
    }
    public static int[] check(int arr[],int k)
    {

        int m=(arr.length)/2;  //2
        int arr1[]=new int[5];
        System.out.println(m);//2
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i<m)            //0<2 1<2
                arr1[i+k]=arr[i];  //newarr[4]= oldarr[1]
            else                     //2==2
                a=(k+i)%arr.length;
                arr1[a]=arr[i];
        }
        return arr1;

    }
}


