package text_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence extends Text {

    private String sentence;

    private List<? super Text> words = new ArrayList<>();

    public Sentence(String sentence, List<? super Text> words) {

        setSentence(sentence);
        words.add(new Word(sentence));
        createSentence(words);
    }

    public void createSentence(List<? super Text> words) {
        StringBuilder sentenceCreater = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sentenceCreater.append(words.get(i).toString());

        }

        System.out.println(sentenceCreater.toString());
    }

    public static void main(String[] args) {

        List<? super Text> words = new ArrayList<>();


        new Sentence("combinateSentence ", words);

    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public List<? super Text> getWords() {
        return words;
    }

    public void setWords(List<? super Text> words) {
        this.words = words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence) &&
                Objects.equals(words, sentence1.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sentence, words);
    }

    @Override
    public String toString() {
        return sentence;
    }
}

