import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("linear " + linearSearch(library1, new Book("Alpha", 1)) + "\n\n");

        ArrayList<Book> library2 = new ArrayList<Book>();
        library2.add(c);
        library2.add(d);
        library2.add(e);
        library2.add(a);
        library2.add(b);

        System.out.println(library2);
        System.out.println("binary " + binarySearch(library2, b));
    }

    public static int linearSearch(ArrayList<Book> list, Book key) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).equals(key)) {
                return index;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> list, Book key) {
        int low = 0;
        int mid = 0;
        int high = list.size()-1;

        while (mid < list.size()) {

            mid = (low + high) / 2;

            if (list.get(mid).equals(key)) {
                return mid;
            } else if (key.getIsbn() > list.get(mid).getIsbn()) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }


        }
        return -1;
    }
}
