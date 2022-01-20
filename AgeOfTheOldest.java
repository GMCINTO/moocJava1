
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            // int oldest = 0;
            if (input.equals("")) {
                break;
            } else {

                int count = 0;

                for (String current : parts) {
                    //oldest = oldest;
                    String[] ssplit = current.split(",");

                    while (count < parts.length) {
                        int age = Integer.valueOf(ssplit[1]);
                        if (age > oldest) {

                            oldest = age;
                        }
                        count++;
                    }

                }

            }

        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
