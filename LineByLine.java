
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String input = scanner.nextLine();
        while (true) {
            String input = scanner.nextLine();
            String[] words = input.split(" ");

            if (input.equals("")) {
                break;
            } else {
                for (String word : words) {
                    System.out.print(word);
                    System.out.println("");
                }
            }
            //return;
        }

    }
}
