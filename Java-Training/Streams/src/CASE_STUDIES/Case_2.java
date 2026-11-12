package CASE_STUDIES;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Case_2 {
    //2. You are given two lists of integers now
    //find sum, avg, max and min of each list separately
    //find k most frequent elements from list1, list2 separately
    //find second most frequent element separately
    //merge two lists into single list using flatMap
    //find common elements from two lists using streams
    //
    //3. Create a list of strings and map each string and string value(length) using stream
    //
    //4. Find all the prime numbers from the given list using stream
    //
    //5. Find all non primes from a list using stream
    //
    //6. If you are given a string find repeating characters in a string using stream
    //
    //7. Find the first repeating character in a string using stream
    //
    //8. Find longest word from given list of strings
    //
    //9. Find shortest word from given list of strings



    public static void main(String[] args) {

        List<Integer> list1=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Integer> list2=List.of(2,4,6,8,5,1,4,76,54,12,55,32);
        Scanner sc=new Scanner(System.in);

        System.out.println("find sum, avg, max and min of each list separately");
        System.out.println("List1 :");
        int max = list1.stream().max(Integer::compareTo).get();
        System.out.println("Max :"+max);
        double avg=list1.stream().mapToInt(n->n).average().getAsDouble();
        System.out.println("Average :"+avg);
        int min=list1.stream().mapToInt(n->n.intValue()).min().getAsInt();
        System.out.println("Min :"+min);
        int sum=list1.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum :"+sum);
        System.out.println("List2 :");
        max = list2.stream().max(Integer::compareTo).get();
        System.out.println("Max :"+max);
         avg=list2.stream().mapToInt(n->n).average().getAsDouble();
        System.out.println("Average :"+avg);
         min=list2.stream().mapToInt(n->n.intValue()).min().getAsInt();
        System.out.println("Min :"+min);
        sum=list2.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum :"+sum);

        //find k most frequent elements from list1, list2 separately
        System.out.println("find k most frequent elements from list1, list2 separately");
        int k=sc.nextInt();
       Set<Map.Entry<Integer, Long>> entry= list1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).collect(Collectors.toSet());


    }


}
