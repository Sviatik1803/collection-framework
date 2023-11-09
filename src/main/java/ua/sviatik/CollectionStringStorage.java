package ua.sviatik;

import java.util.HashMap;
import java.util.Map;

public class CollectionStringStorage {
    private final Map<String, String> map = new HashMap<>();

    public String checkCache(String input) {
        if (map.containsKey(input)) {
            return map.get(input);
        }
        return "";
    }

    public void putValue(String input, String value) {
        map.put(input, value);
    }
}