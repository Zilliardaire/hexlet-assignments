package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        long notFreeEmails = emails.stream()
                .filter(email -> !email.endsWith("@yandex.ru"))
                .filter(email -> !email.endsWith("@gmail.com"))
                .filter(email -> !email.endsWith("@hotmail.com"))
                .count();
        return emails.size() - (int) notFreeEmails;
    }
}
// END
