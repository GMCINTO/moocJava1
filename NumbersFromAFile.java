
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();

        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner scan = new Scanner(Paths.get(file))) {

            // we read the file until all lines have been read
            while (scan.hasNextLine()) {
                // we read one line
                String row = scan.nextLine();
                // we print the line that we read

                list.add(Integer.valueOf(row));
//                System.out.println("test");
//                for (int i = 0; i < list.size(); i++) {
//                    if (list.get(i) <= lowerBound && list.get(i) >= upperBound) {
//                        System.out.println(list.get(count));
//                        count++;
//                    }
//                    //System.out.println("Numbers: " + count);
//
//                }
//                System.out.println("Numbers: " + count);
            }
            System.out.println("");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            //System.out.println("Reading the file " + file + " failed.");
        }
        int i = 0;
        int count = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
               // System.out.println("test");
                count++;
            }
            
            i++;
        }
        System.out.println("Numbers: " + count);
    }
}
