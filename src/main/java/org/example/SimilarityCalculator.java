package org.example;

import java.util.Set;
import java.util.HashSet;

public class SimilarityCalculator {
    public double calculateSimilarity(Set<String> set1, Set<String> set2){
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        return (double) intersection.size() / union.size();
    }
}
