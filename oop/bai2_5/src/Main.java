import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Customer c = new Customer();
        Account a1 = new Account(1, c ,12);
        Account a2 = new Account(2, c ,13);
        Account a3 = new Account(3, c ,14);

        c.addAccount(a1);
        c.addAccount(a2);
        c.addAccount(a3);

        System.out.println("Customer has " + c.getAccounts().size() + " accounts");



        System.out.println(a1);
        System.out.println("Depositing $500...");
        a1.deposit(500);
        System.out.println(a1);
        System.out.println("Withdrawing $56...");
        a1.withdraw(56);
        System.out.println(a1);

    }
}