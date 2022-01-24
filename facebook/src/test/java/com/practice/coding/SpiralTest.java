package com.practice.coding;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Prasada Rao on 24/01/22 4:48 PM
 **/
public class SpiralTest {

    private Spiral SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new Spiral();
    }

    @Test
    public void spiral_1x1() {
        // GIVEN
        final int[][] expected = new int[][]{{1}};

        // WHEN
        final int[][] actual = SUT.spiral(1);

        // THEN
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void spiral_2x2() {
        // GIVEN
        final int[][] expected = new int[][]{{1, 2}, {4, 3}};

        // WHEN
        final int[][] actual = SUT.spiral(2);

        // THEN
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void spiral_3x3() {
        // GIVEN
        final int[][] expected = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};

        // WHEN
        final int[][] actual = SUT.spiral(3);

        // THEN
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void spiral_4x4() {
        // GIVEN
        final int[][] expected = new int[][]{{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};

        // WHEN
        final int[][] actual = SUT.spiral(4);

        // THEN
        assertThat(actual).isEqualTo(expected);
    }
}