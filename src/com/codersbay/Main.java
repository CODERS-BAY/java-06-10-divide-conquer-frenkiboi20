package com.codersbay;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        System.out.println("Maximum: " + divide(nums));

    }

    private static int divide(int[] nums) {

        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        else {

            int[] left = new int[nums.length / 2];
            int[] right = null;

            if (nums.length % 2 == 0) {
                right = new int[nums.length / 2];
            } else {
                right = new int[nums.length / 2 + 1];
            }

            for (int i = 0; i < nums.length; i++) {

                if (i < nums.length / 2) {
                    left[i] = nums[i];
                } else {
                    right[i - nums.length / 2] = nums[i];
                }
            }

            return getMax(left, right);
        }
    }

    public static int getMax(int[] left, int[] right) {

        int max = 0;

        for (int i = 0; i < left.length || i < right.length; i++) {

            if (left[i] > max) {
                max = left[i];
            }
            if (right[i] > max) {
                max = right[i];
            }
        }

        return max;
    }
}
