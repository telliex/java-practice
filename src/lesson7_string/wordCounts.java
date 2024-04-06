package lesson7_string;
import java.util.Scanner;

public class wordCounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some test:");
        String sentence = input.nextLine();
        String modifySentence = sentence.toLowerCase();
        int count = 0;

        System.out.println("Enter a target word:");
        String word = input.nextLine();

        String[] words = modifySentence.split("\\W+");

        // 遍历单词数组，计数
        for (String w : words) {
            if (w.equals(word.toLowerCase())) {
                count++;
            }
        }

        System.out.printf("The word '%s' appears %d times.\n", word, count);

    }
}
