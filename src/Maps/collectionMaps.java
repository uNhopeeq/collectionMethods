package Maps;

import java.util.HashMap;
import java.util.List;

public class collectionMaps {
    public static StringBuilder getWordCount(String sentence) {

        var countWords = new HashMap<String, Integer>();
        var words = List.of(sentence.split(" "));

        if (!sentence.isEmpty()) {
            words.forEach((word) -> {
                countWords.compute(word, (key, count) -> count == null ? 1 : count + 1);
            });
        }
        return mapMethods.trasformation(countWords);
    }
}
