public class Book {
    private String name, author, publisher;
    private int edition, publishYear;

    public Book(String name, String author, String publisher, int edition, int publishYear) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        setEdition(edition);
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        setEdition(0);
    }

    public Book() {
        this.name = "default";
        this.author = "default";
        setEdition(0);
    }

    public String toString() {
        String res = "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'';
        if(edition > 0)
            res += ", publisher='" + publisher + '\'' +
                    ", edition=" + edition  +
                    ", publishYear=" + publishYear+
                    '}';
        else res += ", had not been published yet!}";
        return res;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_aut() {
        return author;
    }

    public void set_aut(String author) {
        this.author = author;
    }

    public String get_pub() {
        return edition > 0 ? publisher:"None";
    }

    public void set_pub(String publisher) {
        this.publisher = publisher;
    }

    public int get_ed() {
        return edition;
    }

    public void set_year(int publishYear) {
        this.publishYear = publishYear;
    }

    public int get_year() {
        return edition > 0 ? publishYear : -1;
    }

    public void setEdition(int edition) {
        if(edition < 0) throw new IllegalArgumentException("Тираж не может быть меньше 0!");
        this.edition = edition;
    }
}