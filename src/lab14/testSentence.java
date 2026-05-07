package lab14;

public class testSentence {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("предложение состоящее из нескольких слов");

        System.out.println("Слова в предложении:");
        for (String word : sentence) {
            System.out.println(word);
        }
    }
}
