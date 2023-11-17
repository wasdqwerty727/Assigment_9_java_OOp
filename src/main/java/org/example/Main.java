package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor1 = new WordProcessor();
            wordProcessor1.readFile("C://Users//Lenovo//OneDrive//Desktop//Test_text.txt");

            WordProcessor wordProcessor2 = new WordProcessor();
            wordProcessor2.readFile("C://Users//Lenovo//OneDrive//Desktop//Test_text2.txt");

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();
            double similarity = similarityCalculator.calculateSimilarity(wordProcessor1.getDistinctWords(), wordProcessor2.getDistinctWords());

            System.out.println("Jaccard Similarity Coefficient: " + similarity);
            System.out.println(wordProcessor1.getDistinctWords());

        } catch (IOException e) {
            System.err.println("An error occurred while processing the files: " + e.getMessage());
        }
    }
}