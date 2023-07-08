package exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            boolean consist = true;
            for (Map.Entry<String, String> search : where.entrySet()) {
                String key = search.getKey();
                String value = search.getValue();
                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    consist = false;
                    break;
                }
            }
            if (consist) {
                result.add(book);
            }
        }
        return result;
    }
}