import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;

        // Call the rotate method to modify the original array
        rotate(arr, k);

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;
        // To handle cases where k is greater than n
        k = k % n;

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

