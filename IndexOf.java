
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        int num = scanner.nextInt();
        int count = 0;
        while (count < list.size()) {

            if (list.get(count) == num) {
                System.out.println(num + " is at index " + count);
                //break;
            }
            count++;
        }
        //

        //int value = 
//        for (int i = list.indexOf(num); i < list.size(); i++){
//            if(i == list.get(0)){
//                System.out.println(list.get(num) + " is at index " + list.indexOf(i));
//                break; 
//            }
//           // value++;
//        }
        System.out.println("");

        // implement here finding the indices of a number
    }
}
