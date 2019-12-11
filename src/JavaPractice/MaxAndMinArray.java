package JavaPractice;

import java.util.Arrays;


public class MaxAndMinArray {
    public static void main(String[] args) {
        int [] arr = {10,24,48,37,75,17};
        Arrays.sort(arr);
        System.out.println("Biggest number is: " + arr[arr.length-1]);
        System.out.println("Smallest number is: " + arr[0]);
    }
}
