package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        for (String str : firstSet){
            if (secondSet.contains(str)){
                result.add(str);
            }
        }
        for (String res : thirdSet){
            if (!firstSet.contains(res) && !secondSet.contains(res)) {
                result.add(res);
            }
        }
        return result;
    }
}
