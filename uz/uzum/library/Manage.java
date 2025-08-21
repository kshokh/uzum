package uz.uzum.library;

import java.util.ArrayList;

public class Manage {
    private final ArrayList<Book> books = new ArrayList<>();
    private int id = 1;

    public void add(String title, String author) {
        books.add(new Book(id++, title, author));
    }

    public void list() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void get(int id) {
        for (Book book : books) {
            if (book.getId() == id)
                System.out.println(book);
        }
    }

    public void delete(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}
