#include "trinary.h"

namespace trinary {
    int to_decimal(const std::string& trinary_number) {
        int result = 0;
        for (char c : trinary_number) {
            if (c < '0' || c > '2') return 0;
            result = result * 3 + (c - '0');
        }
        return result;
    }
}
