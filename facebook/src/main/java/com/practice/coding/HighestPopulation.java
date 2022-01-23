package com.practice.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Prasada Rao on 23/01/22 5:22 PM
 **/
public class HighestPopulation {

    public int findYearWithHighestPopulation(List<Person> people) {
        final Map<Integer, Integer> yearAndPopulationMap = getPopulationByYear(people);
        return getYearWithHighestPopulation(yearAndPopulationMap);
    }

    private Map<Integer, Integer> getPopulationByYear(List<Person> people) {
        final Map<Integer, Integer> yearAndPopulationMap = new HashMap<>();

        for (Person person : people) {
            for (int year = person.getBirthYear(); year < person.getDeathYear(); year++) {
                yearAndPopulationMap.put(year, yearAndPopulationMap.getOrDefault(year, 0) + 1);
            }
        }
        return yearAndPopulationMap;
    }

    private int getYearWithHighestPopulation(Map<Integer, Integer> yearAndPopulationMap) {
        int highestPopulation = Integer.MIN_VALUE, yearWithHighestPopulation = Integer.MIN_VALUE;

        for (Integer year : yearAndPopulationMap.keySet()) {
            final Integer populationByYear = yearAndPopulationMap.getOrDefault(year, 0);
            if (highestPopulation < populationByYear) {
                highestPopulation = populationByYear;
                yearWithHighestPopulation = year;
            }
        }
        return yearWithHighestPopulation;
    }

    public static void main(String[] args) {

    }
}
