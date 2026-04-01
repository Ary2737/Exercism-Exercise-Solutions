import java.lang.StringBuilder;

class SqueakyClean {

    static String clean(String identifier) {
        StringBuilder cleanedIdentifier = new StringBuilder();

        // Index of '-' in identifier string
        int dashIndex;

        // Array of chars in the identifier string
        char[] chars = identifier.toCharArray();

        // Boolean flag to determine if you make next character uppercase
        boolean makeNextCharUpper = false;

        // Iterate through array and implement changes
        for (int i = 0; i < chars.length; i++) {

            //  Check for whitespaces
            if (Character.isWhitespace(chars[i])) {
                cleanedIdentifier.append('_');
            }

            // Check for '-' (Indicates Kebab-case style String)
            else if (chars[i] == '-') {
                makeNextCharUpper = true;
                continue; // Skip adding the dash!
            }

            // Check the flag! (Are we right after a dash?)
            else if (makeNextCharUpper) {
                // Capitalize the current character and append it
                cleanedIdentifier.append(Character.toUpperCase(chars[i]));

                // Turn the flag back off so we don't capitalise everything!
                makeNextCharUpper = false;
            }



            // Check if the character is a digit
            else if(Character.isDigit(chars[i])) {
                switch(chars[i]) {
                    // Only append digits
                    case '4' -> cleanedIdentifier.append('a');
                    case '3' -> cleanedIdentifier.append('e');
                    case '0' -> cleanedIdentifier.append('o');
                    case '1' -> cleanedIdentifier.append('l');
                    case '7' -> cleanedIdentifier.append('t');
                }

            }
            // Default: It's just a normal character, append it as-is
            else if (Character.isLetter(chars[i])) {
                cleanedIdentifier.append(chars[i]);
            }
        }

        return cleanedIdentifier.toString();
    }

}


