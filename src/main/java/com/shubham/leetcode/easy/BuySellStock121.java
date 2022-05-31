package com.shubham.leetcode.easy;

public class BuySellStock121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,4,1}));
    }

    public static int maxProfit(int[] prices) {

        int smallest = Integer.MAX_VALUE;
        int largest = 0;

        for (int price : prices) {
            if (price < smallest) {
                smallest = price;
            } else if ((price - smallest) > largest) {
                largest = price - smallest;
            }
        }

        return largest;
    }
}
