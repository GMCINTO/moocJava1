
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for? ");
        String name = scanner.nextLine();
        int count = 0;

//        String found = null;
//        boolean search = list.contains(name);
        while (count < list.size()) {
            count++;
            if (list.contains(name)) {

                System.out.println(name + " was found!");
                break;
            } else {

                System.out.println(name + " was not found!");
                break;
            }

        }

    }

}
