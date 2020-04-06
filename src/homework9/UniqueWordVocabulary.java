package homework9;

import java.util.HashSet;
import java.util.Set;

//ok
public class UniqueWordVocabulary {

    private Set<String> Vocabulary = new HashSet<>(); // field "Vocubulary" must start with lowerCase

    public void addWord( String word ) {
        if (!word.isEmpty()) {
            Vocabulary.add(word);
        }
    }

    public int getUniqueWords() {
        return Vocabulary.size();
    }

    public String printToConsole() {
        return Vocabulary.toString();
    }

    @Override
    public String toString() {
        return
                "Vocabulary= " + Vocabulary + "\n" + "Count= " + Vocabulary.size();
    }
};
