package com.practice.coding;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Prasada Rao on 23/01/22 5:22 PM
 **/
public class HighestPopulation {

    public int findYearWithHighestPopulation(List<Person> people) {
        Set<YearData> yearData = new HashSet<>();
        for (Person person : people) {
            yearData.add(new YearData(person.getBirthYear(), YearType.BIRTH));
            yearData.add(new YearData(person.getDeathYear(), YearType.DEATH));
        }

        yearData = yearData.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(yearData);

        int populationByYear = 0;
        int maxPopulationByYear = Integer.MIN_VALUE;
        int yearWithHighestPopulation = 0;

        for (YearData yearDatum : yearData) {
            if (yearDatum.type == YearType.BIRTH) {
                populationByYear++;
            } else {
                populationByYear--;
            }
            if (maxPopulationByYear < populationByYear) {
                maxPopulationByYear = populationByYear;
                yearWithHighestPopulation = yearDatum.year;
            }
        }

        return yearWithHighestPopulation;
    }

    private static class YearData {
        private int year;
        private YearType type;

        public YearData(int year, YearType type) {
            this.year = year;
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            YearData yearData = (YearData) o;
            return year == yearData.year && type == yearData.type;
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, type);
        }

        @Override
        public String toString() {
            return "YearData{" +
                    "year=" + year +
                    ", type=" + type +
                    '}';
        }
    }

    private enum YearType {
        BIRTH,
        DEATH
    }

    public static void main(String[] args) {
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

        new HighestPopulation().findYearWithHighestPopulation(people);
    }
}
