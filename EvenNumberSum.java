package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EvenNumberSum {

	    private static List<Integer> getList(int num) {
	        List<Integer> list = new ArrayList<>();

	        for (int i = 0; i <= num; i+=2) {
	                list.add(i);
	        }
	        return list;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Input the length of the sequence: ");
	            int num = sc.nextInt();

	            List<Integer> list =  getList(num);

	            System.out.println("Even numbers: ");
	            list.forEach(System.out::println);

	           Integer sum =0;
	           for (Integer integer : list) {
				sum += integer;
			}
	            System.out.println("Sum: " + sum);
	        } catch (Exception e) {
	            System.out.println("Length not specified");
	        }
	        finally {
	        	sc.close();
	        }
	    }
	}

