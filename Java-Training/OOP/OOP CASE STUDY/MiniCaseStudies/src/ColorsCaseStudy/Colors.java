package ColorsCaseStudy;

import java.util.*;
import java.util.stream.Collectors;

public class Colors {
   static List<String> colorsList=new ArrayList<>();
    public static void main(String[] args) {
        addMock();
        Scanner sc = new Scanner(System.in);
        // find frequency of each color in array list, and finally
        System.out.println("Frequency Of Each Color:");
        Map<String,Long> freq = colorsList.stream().collect(Collectors.groupingBy(color->color,Collectors.counting()));
        freq.entrySet().forEach(entry-> System.out.println(entry.getKey()+"->"+entry.getValue()));
        //   1. Find color with highest frequency
        System.out.println("Find color with highest frequency");
        System.out.println(freq.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(1).map(entry -> entry.getKey()).findFirst().get());
        //   2. Color with lowest frequency
        System.out.println("Color with lowest frequency");
        System.out.println(freq.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()).limit(1).map(entry -> entry.getKey()).findFirst().get());
        //   3. Colors with occurrence of K times.
        System.out.println("3. Colors with occurrence of K times.");
        System.out.println("Enter The Frequency");
        int k=sc.nextInt();
        freq.entrySet().stream().filter(entry-> entry.getValue()==k).forEach(System.out::println);
    }
    public static void addMock() {
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Blue");
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("Blue");
        colorsList.add("Red");
        colorsList.add("Yellow");
        colorsList.add("Green");
        colorsList.add("Red");
        colorsList.add("Black");
        colorsList.add("Blue");
        colorsList.add("White");
        colorsList.add("Green");
        colorsList.add("Red");
        colorsList.add("Blue");
    }
}
