import java.util.*;
import java.util.stream.Collectors;

public class Practice_1 {


    //Create ArrayList of n Strings probably representing names of different programming languages, different databases, different os, different ai tools, that are used for s/w development. now perform the following task

    static List<String> nameslist = List.of("java", "python", "c", "c++", "javaScript", "react", "html", "mysql", "mongodb", "postgresql", "nosql", "windows", "macOS", "linux", "chatGpt", "claude", "antiGravity", "gemini");

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //find all the names of the programming languages, databases, os, ai tools that start with a specific letter(user input)
        System.out.println("find all the names of the programming languages, databases, os, ai tools that start with a specific letter(user input)");
        System.out.println("Enter the Specific Letter");
        char ch=scanner.next().charAt(0);
        List<String> result = nameslist.stream().filter(name -> name.charAt(0) == ch).toList();
        result.stream().forEach(System.out::println);
        //find all the content that starts with j and ends with a
        System.out.println("find all the content that starts with j and ends with a ");
        nameslist.stream().filter(name -> name.charAt(0) == 'j' && name.charAt(name.length() - 1) == 'a').collect(Collectors.toList()).forEach(System.out::println);

        //find all the content that starts with specific letter but in upper case
        System.out.println("find all the content that starts with specific letter but in upper case");
        System.out.println("Enter the Specific Letter");
        nameslist.stream().filter(name -> ch == name.charAt(0)).map(name -> name.toUpperCase()).forEach(System.out::println);

        //find all the content that starts with specific letter but distinct output
        System.out.println("find all the content that starts with specific letter but distinct output");
        nameslist.stream().filter(name -> name.charAt(0) == ch).distinct().forEach(System.out::println);

        //find all the content that starts with specific letter but in upper case and only distinct content
        System.out.println("find all the content that starts with specific letter but in upper case and only distinct content");
        nameslist.stream().filter(name -> name.charAt(0) == ch).distinct().map(name -> name.toUpperCase()).forEach(System.out::println);

        //find all the content that starts with specific letter but in sorted order
        System.out.println("find all the content that starts with specific letter but in sorted order");
        nameslist.stream().filter(name -> name.charAt(0) == ch).sorted().forEach(System.out::println);

        //find all the distinct content that starts with specific letter in upper case and sorted order
        System.out.println("find all the distinct content that starts with specific letter in upper case and sorted order\n");
        nameslist.stream().filter(name -> name.charAt(0) ==ch).map(name -> name.toUpperCase()).sorted().forEach(System.out::println);

        //find the count of distinct count starting with a specific letter
        System.out.println("find the count of distinct count starting with a specific letter");
        long count = nameslist.stream().filter(name -> name.charAt(0) ==ch).distinct().count();
        System.out.println("The Distinct Count :-" + count);
        //find first element of the stream which filters data starting with s
        System.out.println("find first element of the stream which filters data starting with s");
        String first = nameslist.stream().filter(name -> name.charAt(0) == 's').findFirst().orElse(null);
        if (first != null) {
            System.out.println("The First Name in the Stream That Matches ");
        } else {
            System.out.println("No Name That Starts with 's' ");
        }
        //check whether any element starts from s
        System.out.println("check whether any element starts from s");
        boolean isthere = nameslist.stream().anyMatch(name -> name.charAt(0) == 's');
        if (isthere) {
            System.out.println("Yes,There are Names That Starts With 's' ");
        } else {
            System.out.println("No Name That Starts with 's' ");
        }
        //find if all the names start with s
        System.out.println("find if all the names start with s");
        isthere = nameslist.stream().allMatch(name -> name.charAt(0) == 's');
        if (isthere) {
            System.out.println("Yes,All Names Are Starts With 's' ");
        } else {
            System.out.println("No, Not All Names Are Start With 's' ");
        }
    }
}
