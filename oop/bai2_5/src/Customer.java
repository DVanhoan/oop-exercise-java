import java.util.List;
import java.util.ArrayList;
public class Customer {
    private List<Account> accounts;

    private int id;
    private String name;
    private int discount;
    private char gender;
    public Customer() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Customer(List<Account> accounts, int id, String name, int discount) {
        this.accounts = accounts;
        this.id = id;
        this.name = name;
        this.discount = discount;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return name+"("+id+")";
    }
}
