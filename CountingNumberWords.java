package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class CountingNumberWords {
	
	private static List<String> wordsList(String a) {
        List<String> list = new ArrayList<>();
        String[] words = a.split("[\\s|,]+");
        list= Arrays.asList(words);
        list.sort(Comparator.naturalOrder());
        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Input sentences ");
        String string = sc.nextLine();
        List<String> result =  wordsList(string); 
        System.out.println("Count words: " + result.size());
        System.out.println("Words: ");
        for (String string2 : result) {
			System.out.println(string2);
		}  
    }
    finally {
    	sc.close();
    }
    }
}
