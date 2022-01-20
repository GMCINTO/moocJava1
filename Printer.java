
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int count = 0;
        int current = 0;
        while (count < array.length) {
            for (int i = array[current]; i > 0; i--) {
                System.out.print("*");
            }
            current++;
            count++;
            System.out.println("");
        }
    }

}
