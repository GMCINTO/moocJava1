
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter count = new Counter(2);

        count.increase(2);
        count.increase();
        count.decrease(-1);
        System.out.println(count.value());
    }
}
