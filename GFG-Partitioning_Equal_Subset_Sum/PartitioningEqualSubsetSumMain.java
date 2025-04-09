import java.util.*;

public class PartitioningEqualSubsetSumMain {
    public static boolean equalPartition(int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
        System.out.println(equalPartition(arr));
    }
}