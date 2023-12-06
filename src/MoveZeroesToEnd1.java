public class MoveZeroesToEnd1 {
    public static void main(String[] args) {
        int arr[] = {0, 0, 10, 20, 0, 30, 23, 9};
        int n = 0, res = arr.length - 1;

        while (n <= res) {
            if (arr[n] == 0) {
                // Swap the current element with the last non-zero element
                int temp = arr[res];
                arr[res] = arr[n];
                arr[n] = temp;
                res--;
            } else {
                n++;
            }
        }

        for (int a : arr)
            System.out.print(a + " ");
    }
}

