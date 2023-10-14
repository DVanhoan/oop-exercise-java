public class Main {
    public static void main(String[] args) {
        Account a = new Account("1", "hoan", 4);

        System.out.println(a.toString());
        System.out.println("so du moi: "+a.credit(5));
        System.out.println("so tien con lai sau khi chuyen: " +a.debit(7));
        System.out.println("chuyen tien: " + a.transfer("hoan", 7));
    }
}
