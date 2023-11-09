package ua.sviatik;

import java.util.*;

public class CharacterCounter {
    public String countUniqueChar(String str) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (characterIntegerMap.containsKey(key)) {
                characterIntegerMap.put(key, characterIntegerMap.get(key) + 1);
            } else {
                characterIntegerMap.put(key, 1);
            }

        }
        return characterIntegerMap.toString();
    }
}
