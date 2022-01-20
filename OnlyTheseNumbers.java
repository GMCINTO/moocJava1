
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }

        System.out.println("From where?");
        int from = numbers.get(scanner.nextInt());
        System.out.println("To where?");
        int to = numbers.get(scanner.nextInt());
        int count = numbers.indexOf(from);

//        for (int i = numbers.indexOf(from); i < numbers.indexOf(to+1); i++) {
//
//            System.out.println(numbers.get(i));
//
//            //count++;
//        }
        while (count <= numbers.indexOf(to)) {

            System.out.println(numbers.get(count));

            count++;
        }
        //System.out.println(count);
       
    }
}
