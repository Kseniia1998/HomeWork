package home_work4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    public static void main(String[] args) {

        String proposition = "By default, when we use the dot “.” expression in regex, we're matching every character in the input String until we encounter a new line character.";


        List<String> list = new ArrayList<>(Arrays.asList(proposition.split("\\W")));
        list.removeAll(Arrays.asList("", null));
        System.out.println(list);

        String largestWord = list.get(0);
        for(String word : list){
            if(word.toCharArray().length > largestWord.toCharArray().length){
                largestWord = word;
            }
        }
        System.out.println("Largest word: "+largestWord);
    }
}
