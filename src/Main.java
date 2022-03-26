import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> secondList = new ArrayList<>();

        for (Integer number : intList) {
            if (number > 0) {
                if (number % 2 == 0) {
                    secondList.add(number);
                }
            }
        }

        Collections.sort(secondList);

        for (Integer numbers : secondList) {
            System.out.print(numbers + " ");
        }
    }
}
