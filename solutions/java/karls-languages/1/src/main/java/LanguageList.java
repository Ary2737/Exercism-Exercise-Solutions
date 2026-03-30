import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {

        // Get the indexes of both Java and Kotlin
        int javaIndex = languages.indexOf("Java");
        int kotlinIndex = languages.indexOf("Kotlin");

        /**
         * Check if the indexes are equal to -1
         * -1 = Not in list
         * Check if Kotlin or Java is in list
         */


        if(javaIndex > -1 || kotlinIndex > -1) {
            return true;
        } else {
            return false;
        }

    }
}
