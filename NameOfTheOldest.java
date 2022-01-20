
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldName = " ";
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
                            oldName = ssplit[0];
                            oldest = age;
                        }
                        count++;
                    }

                }

            }

        }
        System.out.println("Name of the oldest: " + oldName);

    }
}
