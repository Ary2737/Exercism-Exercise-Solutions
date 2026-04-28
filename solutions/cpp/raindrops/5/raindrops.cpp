#include "raindrops.h"

namespace raindrops {
    // Function to return raindrop string
    string convert(int number) {
        // String to store raindrop string
        string raindrop = "";

        // Boolean statements to determine if number is divisible by 3, 5 or 7
        bool threeMultiple = number % 3 == 0; // True = Add "Pling"
        bool fiveMultiple = number % 5 == 0;  // True = Add "Plang"
        bool sevenMultiple = number % 7 == 0; // True = Add "Plong"

        // Using if-statements to cover all cases

        if(threeMultiple) raindrop += "Pling";
        if(fiveMultiple) raindrop += "Plang";
        if(sevenMultiple) raindrop += "Plong";
        else {
            raindrop = to_string(number);
        }

        

        return raindrop;
    }
    



}  // namespace raindrops
