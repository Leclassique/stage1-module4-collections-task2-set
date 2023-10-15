package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<>();
        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()){
            int element = iterator.next();
            set.add(element * element);
        }
        System.out.println(set);
        return set.subSet(lowerBound, upperBound + 1);
    }
}
