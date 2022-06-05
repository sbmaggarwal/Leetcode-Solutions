package com.shubham.leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReshapeMatrix566 {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] result = new int[r][c];

        int size = mat.length * mat[0].length;
        int requiredSize = r * c;

        if(size != requiredSize) return mat;

        Queue<Integer> queue = new LinkedList();
        int i = 0, j = 0;

        while(size > 0) {

            if(j == mat[0].length) {
                j = 0;
                i++;
            }

            queue.add(mat[i][j]);

            j++;
            size--;
        }

        for (int p = 0; p < r; p++) {
            for (int q = 0; q < c; q++) {
                result[p][q] = queue.remove();
            }
        }

        return result;
    }
}
