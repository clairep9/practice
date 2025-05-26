package ScratchPaper;

import java.util.HashMap;

public class AnagramChecker {
    public boolean isAnagram (String text1, String text2) {
        if (text1.isEmpty() || text2.isEmpty()) {
            throw new IllegalArgumentException("Error");
        }

        if (text1.length() != text2.length()) {
            return false;
        }

        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (int i=0; i<text1.length(); i++) {
            frequency.compute(text1.charAt(i), (key, val) -> (val == null) ? 1 : val + 1);
        }

        for (int i=0; i<text2.length(); i++) {
            char c = text2.charAt(i);
            if (!frequency.containsKey(c) || frequency.get(c) == 0) {
                return false;
            } else {
                int val = frequency.get(text2.charAt(i));
                frequency.put(c, val - 1);
            }
        }

        for (int count : frequency.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
}
