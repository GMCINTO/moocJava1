
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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
        double sum = 0.0;
        System.out.println("");
        while (count < list.size()) {
            int num = list.get(count);
            count++;
            sum = sum + num;
        }
        System.out.println("Average: " + (1.0 * sum / list.size()));

        {

        }

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
