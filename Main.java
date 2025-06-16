package jdbclearning;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t > 0) {
            int n = sc.nextInt(); // size of the array
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.oddsubarrsum(A, n));
            t--;
        }
        sc.close();
    }
}

class Solution {
    public long oddsubarrsum(int[] A, int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - i;
            int totalSubarrays = left * right;
            int oddCount = (totalSubarrays + 1) / 2;
            sum += (long) A[i] * oddCount;
        }
        return sum;
    }
}