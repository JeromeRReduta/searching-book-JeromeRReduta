public class Book implements Comparable{
    String title;
    int isbn;

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getIsbn() == book.getIsbn();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn=" + isbn +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Object o) {
        Book other = (Book)o;
        if(other.isbn == this.isbn)
            return 0;
        else if(this.isbn < other.isbn)
            return -1;
        return 1;
    }
}
