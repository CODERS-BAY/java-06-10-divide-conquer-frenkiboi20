package com.codersbay;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        System.out.println(findMaximum(nums));

    }

    private static int findMaximum(int[] nums) {

        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        else {

            int max = 0;

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
}
