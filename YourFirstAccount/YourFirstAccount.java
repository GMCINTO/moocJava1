
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account checking = new Account("new checking",100);
        
        checking.deposit(20);
        
        System.out.println(checking.toString());
    }
}
