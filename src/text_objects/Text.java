package text_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private String text;

    List<? super Text> sentences = new ArrayList<>();

    public Text(String text, List<? super Text> sentences) {
       sentences.add(new Sentence(text, sentences));
       createText(sentences);
    }

    public Text() {
    }

    public void createText(List<? super Text> sentences){
        StringBuilder textCreater = new StringBuilder();

        for (int i = 0; i < sentences.size(); i++){
            textCreater.append(sentences.get(i).toString());

        }

        System.out.println(textCreater.toString());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<? super Text> getSentences() {
        return sentences;
    }

    public void setSentences(List<? super Text> sentences) {
        this.sentences = sentences;
    }

    public static void main(String[] args) {
           List<? super Text> sentences = new ArrayList<>();
        Text text = new Text("Fjfjfj jfjfj jfjjf jfjjf.", sentences);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text) &&
                Objects.equals(sentences, text1.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, sentences);
    }

    @Override
    public String toString() {
        return text;
    }
}



