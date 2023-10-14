
public class Main {
    public static void main(String[] args) {
        InvoiceItem i = new InvoiceItem("mot", "cheerful",2,2.3);
        System.out.println(i.toString());
        System.out.println("total: "+ i.getTotal());
    }
}
