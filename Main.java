import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
	Book a = new Book("Hello", 12);
	Book b = new Book("Bye", 13);
	Book c = new Book("Zoo", 1);
	Book d = new Book("Alpha", 5);
	Book e = new Book("Bravo", 7);

        ArrayList<Book> library1 = new ArrayList<Book>();
        library1.add(a);
        library1.add(b);
        library1.add(c);
        library1.add(d);
        library1.add(e);

        System.out.println(library1);
        System.out.println("linear "+linearSearch(library1, new Book("Alpha", 1))+"\n\n");

        ArrayList<Book> library2 = new ArrayList<Book>();
        library2.add(c);
        library2.add(d);
        library2.add(e);
        library2.add(a);
        library2.add(b);

        System.out.println(library2);
        System.out.println("binary "+binarySearch(library2, b));
    }

    public static int linearSearch(ArrayList<Book> list, Book key)
    {
        return -1;
    }

    public static int binarySearch(ArrayList<Book> list, Book key)
    {
        return -1;
    }
}
