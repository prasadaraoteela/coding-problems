package com.practice.coding;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;

/**
 * Created by Prasada Rao on 23/01/22 5:32 PM
 **/
public class HighestPopulationTest {

    private HighestPopulation SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new HighestPopulation();
    }

    @Test
    public void findYearWithHighestPopulation_emptyList_zeroReturned() {
        // GIVEN
        final List<Person> people = Arrays.asList(
                new Person(2000, 2010),
                new Person(1980, 2005),
                new Person(1975, 2003),
                new Person(1990, 2020),
                new Person(1990, 2000),
                new Person(1991, 2000),
                new Person(1992, 2000),
                new Person(1803, 1809),
                new Person(1759, 1869),
                new Person(1840, 1935),
                new Person(1860, 1921),
                new Person(1894, 1921)
        );
        // WHEN
        int yearWithHighestPopulation = SUT.findYearWithHighestPopulation(people);
        // THEN
        assertThat(yearWithHighestPopulation).isEqualTo(1992);
    }
}