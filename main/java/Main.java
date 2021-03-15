import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        List<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20).collect(toList());
        System.out.println(streamIterated);


    }
}