package test;

import java.util.List;
import java.util.Objects;

public class ACPro {
    private ACProTrie acProTrie;


    public boolean hasSensitiveWord(String text) {
        return !Objects.equals(filter(text),text);
    }


    public String filter(String text) {
        return acProTrie.match(text);
    }

    public void loadWord(List<String> words) {
        if (words == null) return;
        acProTrie = new ACProTrie();
        acProTrie.createACTrie(words);
    }
}
