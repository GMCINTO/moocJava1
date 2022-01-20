
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] sentence = input.split(" ");
            int count = 0;
            if (input.equals("")) {
                break;
            }
            if (count < sentence.length) {
                System.out.println(sentence[sentence.length - 1]);
            }

        }
    }
}
