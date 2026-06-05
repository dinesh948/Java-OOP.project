package BaseDump.java;

import java.util.*;

public class Sliding {
    public static void main(String[] args) {
        sssum();

    }

    public static void sssum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        int wsum = 0;
        for (int i = 0; i < n; i++) {
            wsum += arr[i];
        }

        int maxsum = wsum;
        for (int i = k; i < arr.length; i++) {
            wsum = wsum - arr[i - k] + arr[i];
            maxsum = Math.max(maxsum, wsum);
        }
        System.out.println(maxsum);
    }
