package com.practice.coding;

import java.util.Arrays;

/**
 * Created by Prasada Rao on 24/01/22 9:47 AM
 **/
public class Spiral {

    public int[][] spiral(int n) {

        int[][] result = new int[n][n];
        int number = 1;

        int left = 0, top = 0, right = n - 1, bottom = n - 1;

        Direction direction = Direction.TOP;

        while (top <= bottom && left <= right) {
            switch (direction) {
                case TOP -> {
                    for (int i = left; i <= right; i++) {
                        result[top][i] = number++;
                    }
                    top++;
                    direction = Direction.RIGHT;
                }
                case RIGHT -> {
                    for (int i = top; i <= bottom; i++) {
                        result[i][right] = number++;
                    }
                    right--;
                    direction = Direction.BOTTOM;
                }
                case BOTTOM -> {
                    for (int i = right; i >= left; i--) {
                        result[bottom][i] = number++;
                    }
                    bottom--;
                    direction = Direction.LEFT;
                }
                case LEFT -> {
                    for (int i = bottom; i >= top; i--) {
                        result[i][left] = number++;
                    }
                    left++;
                    direction = Direction.TOP;
                }
                default -> throw new IllegalStateException("Unknown direction!");
            }
        }
        return result;
    }

    private enum Direction {
        LEFT, TOP, RIGHT, BOTTOM
    }

    public static void main(String[] args) {
        final Spiral spiral = new Spiral();
        System.out.println(Arrays.deepToString(spiral.spiral(2)));
        System.out.println(Arrays.deepToString(spiral.spiral(3)));
        System.out.println(Arrays.deepToString(spiral.spiral(4)));
    }
}
