
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int count = 0;
        int sum = 0;
        System.out.println("");
        while (count < list.size()) {
            int num = list.get(count);
            count++;
            sum = sum + num;
        }
        System.out.println("Sum: " + sum);

        {

        }
    }
}
