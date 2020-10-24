package Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("A fake world"));
        bookShelf.appendBook(new Book("Build you dream"));
        bookShelf.appendBook(new Book("Conquer HW"));
        bookShelf.appendBook(new Book("Deploy Web App"));
        bookShelf.appendBook(new Book("Elastic search"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book=(Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
