public class Main {

    public static void main(String[] args) {
        Author[] authors = new Author[]{new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'), new Author("Paul Tan", "Paul@nowhere.com", 'm')};
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}