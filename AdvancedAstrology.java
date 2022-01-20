public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;

        }

        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number > 0) {
            System.out.print(" ");
            number--;

        }

    }

    public static void printTriangle(int size) {

        int num = size;
        int num2 = 1;
        while (num > 0) {
            num--;
            printSpaces(num);
            printStars(num2);

            num2++;

            //printStars(num);
        }
    }
// part 2 of the exercise

    public static void christmasTree(int height) {
        int num = height;
        int num2 = 0;
        int num3 = 2;
        while (num > 0) {

            num2++;

            printSpaces(num - 1);
            num--;
            num2++;
            printStars(num2 - 1);//println comes from printStars

        }
        while (num3 > 0) {

            printSpaces((height) - 2);
            printStars(3);
            // System.out.println("");
            num3--;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

    }
}
