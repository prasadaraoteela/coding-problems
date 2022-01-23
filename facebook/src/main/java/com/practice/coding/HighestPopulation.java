package com.practice.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Prasada Rao on 23/01/22 5:22 PM
 **/
public class HighestPopulation {

    public int findYearWithHighestPopulation(List<Person> people) {
        final Map<Integer, Integer> yearAndPopulationMap = new HashMap<>();

        int minYear = Integer.MAX_VALUE;
        int maxYear = Integer.MIN_VALUE;

        for (Person person : people) {
            minYear = Math.min(minYear, person.getBirthYear());
            maxYear = Math.max(maxYear, person.getDeathYear());
        }

        for (int year = minYear; year < maxYear; year++) {
            for (Person person : people) {
                if (person.getBirthYear() <= year && person.getDeathYear() > year) {
                    yearAndPopulationMap.put(year, yearAndPopulationMap.getOrDefault(year, 0) + 1);
                }
            }
        }
        System.out.println(yearAndPopulationMap);
        int highestPopulation = Integer.MIN_VALUE;
        int maxYearWithHighestPopulation = Integer.MIN_VALUE;
        for (Integer year : yearAndPopulationMap.keySet()) {
            if (highestPopulation < yearAndPopulationMap.getOrDefault(year, 0)) {
                highestPopulation = yearAndPopulationMap.getOrDefault(year, 0);
                maxYearWithHighestPopulation = year;
            }
        }
        return maxYearWithHighestPopulation;
    }

    public static void main(String[] args) {

    }
}
