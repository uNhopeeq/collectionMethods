package Maps;

import java.util.HashMap;
import java.util.Map;

public class mapMethods {
    public static StringBuilder trasformation(Map<String, Integer> hashMap) {

        StringBuilder ans = new StringBuilder();
        ans.append("{\n");

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            ans.append("  ")
                    .append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue())
                    .append("\n");
        }
        ans.append("}");
        return ans;
    }
}
