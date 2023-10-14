
public class Author {
    private String name;
    private String email;
    private char gender;
    private Author[] Author;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author[] getAuthor() {
        return this.Author;
    }

    public String getAuthorNames() {
        String var10000 = this.Author[0].getName();
        return var10000 + this.Author[1].getName();
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Author{name='" + this.name + "', email='" + this.email + "', gender=" + this.gender + "}";
    }
}
