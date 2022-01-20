
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //int duration = 0;
        while (true) {
            //Scanner scanner = new Scanner(System.in);
            //System.out.print("");

            System.out.println("Name:");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
//                System.out.println("Programs maximum duration: ");
//                int max = scanner.nextInt();
//                for (int i = 0; i < programs.size(); i++) {
//                    if (programs.get(i).getDuration() <= max) {
//                        System.out.println(programs.get(i));
//                    }
//
//                }

                break;

            } else {
                
                System.out.println("Duration:");
                //Scanner scanner = new Scanner(System.in);
                int duration = Integer.valueOf(scanner.nextLine());
                //int duration = scanner.nextInt();

                programs.add(new TelevisionProgram(name, duration));
            }
        }
        System.out.println("Program's maximum duration?");
        //Scanner scan = new Scanner(System.in);
        int max = scanner.nextInt();
        for (int i = 0; i < programs.size(); i++) {
            if (programs.get(i).getDuration() <= max ) {
                System.out.println(programs.get(i));
            }

        }

//        System.out.println("Programs maximum duration: ");
//        int max = scanner.nextInt();
//        for (int i = 0; i > programs.size(); i++) {
//            if (programs.get(i).getDuration() <= max) {
//                System.out.println(programs.get(i));
//            }
    }
}
