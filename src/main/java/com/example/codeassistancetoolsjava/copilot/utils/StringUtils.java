package com.example.codeassistancetoolsjava.copilot.utils;

public class StringUtils {

    public static boolean checkIfStringContainsGoolge(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("google");
    }

    static void binarySearch(String[]arr, String ele) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = ele.compareTo(arr[m]);
            if (res == 0) {
                System.out.println("Element found at index " + m);
                return;
            }
            if (res > 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println("Element not found");
    }

}
