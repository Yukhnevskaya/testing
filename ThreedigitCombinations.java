package task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThreedigitCombinations {

	static List<String> permutations = new ArrayList<String>();
	static Set<Integer> result = new HashSet<Integer>();
	
	private static void getPermutations(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) permutations.add(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            getPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] numbers = new Integer[4];
		try {
			do {
				System.out.println("Input the first number");
			    numbers[1] = sc.nextInt();
			}
			while(numbers[1] > 9);
			do {
			    System.out.println("Input the second number ");
			    numbers[2] = sc.nextInt();
			}
			while(numbers[2] > 9);
			do {
				System.out.println("Input the third number "); 
				numbers[3] = sc.nextInt();
			}
		    while(numbers[3] > 9);
		    getPermutations("", "123");
		    for (String item : permutations) {
		    	result.add(numbers[Integer.parseInt(item.substring(0, 1))]  * 100 + 
		    			numbers[Integer.parseInt(item.substring(1, 2))] * 10 +
		    			numbers[Integer.parseInt(item.substring(2))]);
			}
		    for (Integer integer : result) {
				System.out.println(integer);
			}
	    }
	    finally {
	    	sc.close();
		}
	}
}
	
