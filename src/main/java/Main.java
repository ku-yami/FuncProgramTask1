import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Строка для словаря
        String lorem =
                "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ea est "
                        + "accusantium nostrum error omnis molestias hic illum aliquid officiis inventore "
                        + "deleniti a ducimus, officia sunt voluptatem rerum dignissimos quam vel?";

        Function<String, List<String>> dictionary =
                (s) -> Arrays.stream(s.split("[ .,?]+")).sorted().distinct().toList();

        dictionary.apply(lorem).forEach(System.out::println);
    }
}
