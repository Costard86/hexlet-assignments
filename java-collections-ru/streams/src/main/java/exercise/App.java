package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> emails) {

        List<String> freeDomain = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emails.stream()
                .map(email -> email.substring(email.lastIndexOf("@") + 1))
                .filter(email -> freeDomain.contains(email))
                .count();
    }
}
// END
