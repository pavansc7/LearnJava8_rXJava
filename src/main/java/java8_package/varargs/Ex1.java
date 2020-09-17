package java8_package.varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
Arrays.stream(convertToUpperCase("pavan", "kumar")).forEach(System.out::println);
    }

    static String[] convertToUpperCase(String... strings1){
        Stream<String> stream1 = Stream.of("asa");
        String[] array  = Arrays.stream(strings1).map(s -> s.toUpperCase()).toArray(val->new String[val]);
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        return array;
    }
}
