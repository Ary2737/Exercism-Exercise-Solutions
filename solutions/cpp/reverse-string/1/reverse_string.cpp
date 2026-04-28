#include "reverse_string.h"

namespace reverse_string {
    string reverse_string(string s) {
        // String to store reversed String
        string reversedString = "";


        // Last index of string
        int lastIndex = s.length() - 1;

        // Go from end of string to start of string via index
        for(int i = lastIndex; i >= 0; --i) {
            reversedString += s[i];
        }

        return reversedString;
    }



}  // namespace reverse_string
