
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));

        // Try your method here
    }

    public static int sum(ArrayList<Integer> numbers) {
        int count = 0;
        int newNum = 0;
        int sum = 0;

        while (count < numbers.size()) {
            int num = numbers.get(count);

            sum = sum + num;
            count++;

        }

        return sum;
    }
}
