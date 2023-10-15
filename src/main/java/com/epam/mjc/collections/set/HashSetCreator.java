package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer i : sourceList){
            if (i % 2 ==0){
                result.add(i);
                int res = i;
                while (res % 2 == 0) {
                    result.add(res /= 2);
                }
            } else {
                result.add(i);
                result.add(i * 2);
            }
        }
        return result;
    }
}
