class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int currentSum = arr[i] + arr[j] + arr[k];

                if (currentSum == target) {
                    count++;
                    j++;
                    k--;
                } else if (currentSum < target) {
                    j++; // Move forward to increase the sum
                } else {
                    k--; // Move backward to decrease the sum
                }
            }
        }

        return count;
    }
}
