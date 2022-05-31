package com.shubham.leetcode.easy;

import java.util.Arrays;

public class IntersectionTwoArrays350 {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        int[] result = new int[nums2.length];

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                result[k++] = nums1[i++];
                ++j;
            }
        }

        return Arrays.copyOfRange(result, 0, k);
    }
}
