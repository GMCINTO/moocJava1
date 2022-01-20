
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            //Scanner scan = new Scanner(System.in);
            System.out.println("Title:");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }else{
            System.out.println("Pages:");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year:");
            //int year = scan.nextInt();
            int year = Integer.valueOf(scan.nextLine());

            bookList.add(new Book(title, pages, year));
            }
        }

        System.out.println("What information will be printed?");
        String input = scan.nextLine();
        if (input.equals("everything")) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i));
            }
        } else if (input.equals("name")) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i).getTitle());
            }

        }
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
