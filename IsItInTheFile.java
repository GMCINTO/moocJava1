
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scan.hasNextLine()) {
                // we read one line
                String row = scan.nextLine();
                // we print the line that we read
                list.add(row);
            }

        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
            System.out.println("Reading the file " + file + " failed.");
            return;
        }
        System.out.println("");

        //System.out.println("Enter names, an empty line quits.");
        int count = 0;
        while (true) {
            String name = list.get(count);
            count++;
            if (name.isEmpty()) {
                break;
            }

            else if (list.contains(searchedFor)) {
                System.out.println("Found.");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }
            
        }

        //System.out.println("Thank you!");
    }
}
