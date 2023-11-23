package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WordProcessor wp1 = new WordProcessor();
        WordProcessor wp2 = new WordProcessor();
        wp1.readFile("C://Users//Lenovo//OneDrive//Desktop//Test_text4.txt");
        System.out.println(wp1.getDistinctWords());
        wp2.readFile("C://Users//Lenovo//OneDrive//Desktop//Test_text5.txt");
        System.out.println(wp2.getDistinctWords());

        SimilarityCalculator sim = new SimilarityCalculator();
        System.out.println(sim.calculateSimilarity(wp1.getDistinctWords(), wp2.getDistinctWords()));
    }
}