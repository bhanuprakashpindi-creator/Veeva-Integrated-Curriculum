package CASE_STUDIES;

import javax.swing.text.html.Option;
import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

        List<Integer> list1=List.of(1,2,3,5,3,5,4,4,5,6,7,8,9,10,11,12,13,14,15);
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
        list1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).limit(k).forEach(System.out::println);

       Stream<Map.Entry<Integer,Long>> mapList= list2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).limit(k);
       mapList.forEach(entry-> System.out.println(entry.getKey()+"->"+entry.getValue()));

        System.out.println("find second most frequent element separately");

       Map<Integer,Long> map= list1.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
       Optional<Map.Entry<Integer,Long>> map2 = map.entrySet().stream().sorted(Map.Entry.<Integer,Long>comparingByValue().reversed()).skip(1).findFirst();
       map2.stream().forEach(entry-> System.out.println("The Second Element "+entry.getKey() + "With Frequncey ->"+entry.getValue()));

       Map<Integer,Long> map3 = list2.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
       map3.entrySet().stream().sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()).skip(1).findFirst().ifPresent(entry-> System.out.println(entry.getKey()+"->"+entry.getValue()));
        System.out.println("merge two lists into single list using flatMap");

        List<Integer> merge = Stream.concat(list1.stream(),list2.stream()).toList();
        System.out.println(merge);

        System.out.println("find common elements from two lists using streams");
        List<Integer> common=list1.stream().filter(n-> list2.contains(n)).distinct().toList();
        System.out.println(common);

//4. Create a list of strings and map each string and string value(length) using stream
        System.out.println("4. Create a list of strings and map each string and string value(length) using stream");
        List<String> list3=List.of("Bhanu","Prakash","Nagu","RamCharan","AA");

        //5. Find all the prime numbers from the given list using stream
        list3.stream().collect(Collectors.toMap(s->s,s->s.length())).entrySet().forEach(System.out::println);
        System.out.println("5.Find all the prime numbers from the given list using stream");
        List<Integer> list4=List.of(1,2,3,4,5,6,7,8,9,10,12,13,14,15);
        list4.stream().filter(n->{
            if(n<2) return false;
            if(n==2 || n==3) return true;
            for (int i=2;i<n;i++)
            {
                if(n%i==0) return false;
            }
            return true;
        }).forEach(System.out::println);

        //6. Find all non primes from a list using stream"
        System.out.println("6. Find all non primes from a list using stream");

        list4.stream().filter(n->{
            if(n==1 || n==0) return true;
            if(n==2|| n==3) return false;
            for (int i=2;i<n;i++)
            {
                if(n%i==0) return true;
            }
            return false;
        }).forEach(System.out::println);
        //7. If you are given a string find repeating characters in a string using stream
        System.out.println("7. If you are given a string find repeating characters in a string using stream");
        String name="Bhanu Prakash Pindi";
        List<Character> characterList = name.chars().boxed()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue() >1 && entry.getKey()!=' ')
                .map(entry->(char) entry.getKey().intValue()).toList();
        characterList.stream().forEach(System.out::println);
        System.out.println("Using mapToObj");
        name.chars().mapToObj(ch->(char) ch)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1 && entry.getKey()!=' ')
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //7. Find longest word from given list of strings
        System.out.println("8. Find longest word from given list of strings");
        list3.stream().sorted(Comparator.comparingInt((String str)->str.length()).reversed()).findFirst().ifPresent(System.out::println);

        //8. Find shortest word from given list of strings
        System.out.println("9. Find shortest word from given list of strings");
        Optional<String> stringOptinal =list3.stream().sorted(Comparator.comparingInt((String str)->str.length())).findFirst();
        if (stringOptinal.isPresent())
        {
            System.out.println(stringOptinal.get());
        }
    }


}
