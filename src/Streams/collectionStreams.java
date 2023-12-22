package Streams;

import java.util.ArrayList;
import java.util.List;

public class collectionStreams {
    public static int getCountOfFreeEmails(String[] emails) {

        ArrayList<String> domens = new ArrayList<>();
        var count = 0;

        for (var email : emails) {
            var split = email.split("@");

            if (split[1].equals("gmail.com")) {
                count += 1;
            }
            if (split[1].equals("yandex.ru")) {
                count += 1;
            }
            if (split[1].equals("hotmail.com")) {
                count += 1;
            }
        }
        return count;
    }
}
