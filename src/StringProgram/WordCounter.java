package StringProgram;

public class WordCounter {
    public static void main(String[] args) {
        String str = "Java is easy to learn";
        int wordCount = 0;

        String[] words = str.split(" ");
        wordCount = words.length;

        System.out.println("Number of words = " + wordCount);
    }
}
