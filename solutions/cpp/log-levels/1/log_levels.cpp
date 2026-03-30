#include <string>

using std::string;

namespace log_line {
      string message(std::string line) {
         int colonIndex = line.find(":");
         return line.substr(colonIndex + 2);
}

    string log_level(string line) {
        int openBracketIndex = line.find("[");
        int closedBracketIndex = line.find("]");
        return line.substr(openBracketIndex + 1,(closedBracketIndex - openBracketIndex)-1);

}

    string reformat(string line) {
        // return the reformatted message
        return message(line) + " (" + log_level(line) + ")";
       }
    }// namespace log_line
