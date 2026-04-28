#include "trinary.h"



namespace trinary {
    int to_decimal(string trinary_number) {
        // Integer to be returned
        int integer_number = 0;

        // Digit that is converted from string to int
        int trinary_digit = 0;

        // Go backwards in the string (From the length - 1 to 0)
        for(int index{trinary_number.length() - 1}; index >= 0; --index) {
            // Convert the string to a trianry_digit (int)
            trinary_digit = stoi(&trinary_number[index]);

            // Trinary Digit to int conversion - Trinary_digit * 3 ^ (index of trinary_digit)
            integer_number += trinary_digit * pow(3,index);

        }

        return integer_number;
    }
}  
