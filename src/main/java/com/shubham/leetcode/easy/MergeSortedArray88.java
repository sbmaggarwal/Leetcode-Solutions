package com.shubham.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray88 {

    public static void main(String[] args) {


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int element = 0;

        for (int i = m ; i < (m + n) ; i++) {
            nums1[i] = nums2[element];
            element++;
        }

        Arrays.parallelSort(nums1);
    }
}
