
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);

        }

        //int lowest = list.get(0);
        int smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;

            }
        }

        System.out.println("The smallest number: " + smallest);
        int count = 0;
        while (count < list.size()) {

            if (list.get(count) == smallest) {
                System.out.println(smallest + " is at index " + count);
                //break;
            }
            count++;
        }
//        
//        while (count > list.size()) {
//            
//            if (count == list.indexOf(count)) {
//
//                System.out.println("Found at index: " + count);
//                //return;
//            }
//            count--;
        //return;
    }
    // implement here a program that reads user input
    // until the user enters 9999
    // after that, the program prints the smallest number
    // and its index -- the smallest number
    // might appear multiple times
}
