#include "difference_of_squares.h"

namespace difference_of_squares {

    long long square_of_sum(int number) {
        // Formula for sum of N natural numbers: N(N + 1)/2
        int sum =  number * (number + 1)/2;

        return sum * sum;
    }

    long long sum_of_squares(int number) {
        // Formula for sum of the first N natural number squares: N(N + 1)(2N + 1)/6
        return number * ((number + 1) * ((2 * number) + 1)) / 6;
    }

    long long difference(int number) {
        return square_of_sum(number) - sum_of_squares(number);
    }

    


}  // namespace difference_of_squares
