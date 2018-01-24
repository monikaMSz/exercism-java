
import java.util.HashMap;
import java.util.Map;

class Scrabble {


    private String word;
    private static Map<Character, Integer> letterValues;

    Scrabble(String word) {
        this.word = word.toUpperCase();
        letterValues = new HashMap<>();
    }

    int getScore() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] lettersScore = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        for (int i = 0; i < letters.length(); i++) {
            letterValues.put(letters.charAt(i), lettersScore[i]);

        }
        int result = 0;

        for (int j = 0; j < word.length(); j++) {
            result += letterValues.get(word.charAt(j));

        }
        return result;
    }


}
