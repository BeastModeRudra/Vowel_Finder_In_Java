public class VowelCounter {
    
    public static void main(String[] args) {
        
        String[] words = {"apple", "banana", "orange", "grape"};
        countAndDisplayVowels(words);
    }

    public static void countAndDisplayVowels(String[] words) {
        int vowelCount = 0;

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
        }

        System.out.println("Total number of vowels in the array: " + vowelCount);
    }
}