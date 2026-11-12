package CASE_STUDIES;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*4.Practical Questions on Stream

	1.create a list of strings and filter out , strings with at least four characters , convert them into uppercase , remove duplicates , sort naturally and finally collect the output stream. produce the  output at every stage
	2.given array of n integers and task is return values greater than 5 , square them , remove duplicates and sort in ascending order.
	3.given a list of integers now find one numbers that appears more than once.
	4.given a string find first non - repeating character in the string.*/
public class Case_6 {
    public static void main(String[] args) {
        System.out.println("create a list of strings and filter out , strings with at least four characters , convert them into uppercase , remove duplicates , sort naturally and finally collect the output stream. produce the  output at every stage");
        List<String> strings=List.of("baththa","dc","og","Ramayana","Ramayana","jailer","jailer2");
        Stream<String> outStream = strings.stream().filter(str-> str.length() >3).map(str-> str.toUpperCase()).distinct().sorted();
        outStream.forEach(System.out::println);
        System.out.println("given array of n integers and task is return values greater than 5 , square them , remove duplicates and sort in ascending order.\n");
        int[] array={1,2,3,9,4,5,6,10,3,56,34,23,26};
       IntStream result=  Arrays.stream(array).filter(n->n >5).map(n->n*2).distinct().sorted();
       result.forEachOrdered(System.out::println);
        System.out.println("3.given a list of integers now find one numbers that appears more than once.");
        List<Integer> list = List.of(1,1,3,4,5,6,7,4,2,67,67,99);
        list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().forEach( entry-> {
            if(entry.getValue()>1)
                System.out.println(entry.getKey()+"->"+entry.getValue());
        });
        System.out.println("4.given a string find first non - repeating character in the string.");
        String text="BhanuPrakash";
        Map.Entry<Character,Long> character = text.chars().mapToObj(ch-> (char) ch).collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(ent-> ent.getValue() ==1).findFirst().orElse(null);
        System.out.println(character.getKey());
    }

}

