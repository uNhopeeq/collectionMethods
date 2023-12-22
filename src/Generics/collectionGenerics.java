package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class collectionGenerics {
    public static List findWhere(List<Map<String, String>> books, Map<String, String> where) {

        StringBuilder ans = new StringBuilder();
        List<Map<String, String>> filtredBooks = new ArrayList<>();

        books.forEach(book -> {
            if (book.get("author").equals(where.get("author")) && book.get("year").equals(where.get("year"))) {
                filtredBooks.add(book);
            }
        });
        return filtredBooks;
    }
}
