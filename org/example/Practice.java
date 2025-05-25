package org.example;

import java.util.Arrays;

public class Practice {
    public String swapVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a value: " + a + " b value: " + b);
        return "a value: " + a + " b value: " + b;
    }

    public String stringCompression(String input) {
        if (input.isEmpty()) {
            System.out.println("Empty String");
            return "Empty String";
        }
        StringBuilder output = new StringBuilder();
        char currLetter = input.charAt(0);
        int count = 0;
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == currLetter) {
                count++;
            } else {
                output.append(currLetter);
                output.append(count);
                currLetter = input.charAt(i);
                count = 1;
            }
        }
        output.append(currLetter);
        output.append(count);
        System.out.println(output.toString());
        return output.toString();

    }

    public int largestSumSubarray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("0");
            return 0;
        }
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i=1; i<arr.length; i++) {
            currSum += arr[i];
            currSum = Math.max(currSum, arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("max: " + maxSum);
        return maxSum;
    }

    public int[] rotateArray (int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return arr;
        }

        int n =  arr.length;
        k = k % n;
        reverseRotate(arr, 0, n - 1);
        reverseRotate(arr, 0, k - 1);
        reverseRotate(arr, k, n - 1);
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public void reverseRotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
