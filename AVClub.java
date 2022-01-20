
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//
//        String[] words = input.split(" ");
        while (true) {
            String input = scanner.nextLine();
            String[] words = input.split(" ");

            if (input.equals("")) {
                break;
            }
            int count = 0;
            while (count < words.length) {

                if (words[count].contains("av")) {
                    System.out.println(words[count]);
                }
//            } else if (!(words[count].contains("av"))) {
//                return;
//            }

                count++;
            }
        }
    }
}
