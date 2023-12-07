public class SplitArrayIntoThreeEqualSums {
    public static void main(String[] args) {
       // int[] arr = {5,2,6,1,1,1,1,4};
        int[] arr = {3,2,5,1,1,5};

        if (canSplitIntoThreeEqualSums(arr)) {
            System.out.println("The array can be split into three equal sum subarrays.");
        } else {
            System.out.println("The array cannot be split into three equal sum subarrays.");
        }
    }

    static boolean canSplitIntoThreeEqualSums(int[] arr) {
        int totalSum = 0;

        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }
       // System.out.println(totalSum);

        if (totalSum % 3 != 0) {
            // If the total sum is not divisible by 3, we cannot split into three equal sum subarrays
            return false;
        }

        int targetSum = totalSum / 3;
        int currentSum = 0;
        int count = 0;

        // Iterate to find positions where cumulative sum equals one-third of the total sum
        for (int i = 0; i <= arr.length - 1; i++) {
            currentSum += arr[i];

            if (currentSum == targetSum) {
                count++;

               System.out.println(count+" "+currentSum+" "+arr[i]+" "+i);
                currentSum = 0;
            }
        }

        // If count is 3, we have successfully split into three equal sum subarrays
        if(count == 3)
            return true;
        return false;
    }
}

