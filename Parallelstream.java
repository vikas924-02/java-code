import java.util.Arrays;

public class Parallelstream { // Changed from 'Solution' to match filename

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr)
                        .parallel()
                        .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}