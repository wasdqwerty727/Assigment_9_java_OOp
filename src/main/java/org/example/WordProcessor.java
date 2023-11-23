package org.example;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordProcessor {
    private Set<String> distinctWords = new HashSet<>();
    public void readFile(String filepath){
        try{
            File file = new File(filepath);
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext()){
                String word = myReader.next().replaceAll("[,.?!]", "").toLowerCase();
                distinctWords.add(word);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
    public Set<String> getDistinctWords(){
        return distinctWords;
    }
}
