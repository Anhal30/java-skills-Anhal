public class TextProcessor {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        String[] words = sentence.split(" ");

        System.out.println("Number of words: " + words.length);
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println("- " + word);
        }

        System.out.println("\nReversed words:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
