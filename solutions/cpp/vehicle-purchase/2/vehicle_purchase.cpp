#include "vehicle_purchase.h"

using std::string;

namespace vehicle_purchase {

// needs_license determines whether a license is needed to drive a type of
// vehicle. Only "car" and "truck" require a license.
bool needs_license(string kind) {
    // Ternary Operator to return true for "car" and "truck"
    return kind == "car" ||  kind == "truck" ? true:false;
}

// choose_vehicle recommends a vehicle for selection. It always recommends the
// vehicle that comes first in lexicographical order.
std::string choose_vehicle(string option1, string option2) {
    if(option1 < option2) {
        return option1 + " is clearly the better choice";
    } else if (option2 < option1) {
        return option2 + " is clearly the better choice";
    }

    return "not yet implemented";
}

// calculate_resell_price calculates how much a vehicle can resell for at a
// certain age.
double calculate_resell_price(double original_price, double age) {
    // Handling edge cases (ECs)
    // EC1: age of vehilce is less than 3 
    // EC2: age of vehicle is greater than 10

    if(age < 3) {
        return original_price * 80/100;
    } else if(age >= 10) {
        return original_price * 50/100;
    }

    // If statement of handle vehicle age between 3-10
    if(age >= 3 && age < 10) {
        return original_price * 70/100;
    }

    return 0.0;
}

}  // namespace vehicle_purchase
