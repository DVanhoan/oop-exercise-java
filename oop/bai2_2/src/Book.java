
import java.util.Arrays;

public class Book {
    private String name;
    Author[] authors;
    double price;
    int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public String getAuthorNames() {
        String var10000 = this.authors[0].getName();
        return var10000 + this.authors[1].getName();
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int setQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String var10000 = this.name;
        return "Book{name='" + var10000 + "', authors=" + Arrays.toString(this.authors) + ", price=" + this.price + ", qty=" + this.qty + "}";
    }
}
