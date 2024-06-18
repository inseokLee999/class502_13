package day02.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tomas");
        list.add("Jack");
        list.add("Edward");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);
    }
}
