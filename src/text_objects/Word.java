package text_objects;

import java.util.Collections;
import java.util.List;

public class Word extends Text{
    private String word;

    public Word(String word){
        setWord(word);
        getWord();

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
