package ua.sviatik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            CharacterCounter characterCounter = new CharacterCounter();
            String input;
            CollectionStringStorage collectionStringStorage = new CollectionStringStorage();
            while (!(input = scanner.nextLine()).equals("stop")) {
                String result = collectionStringStorage.checkCache(input);
                if (result.isEmpty()) {
                    result = characterCounter.countUniqueChar(input);
                    collectionStringStorage.putValue(input, result);
                }
                System.out.println(result);
            }
        }
    }
}