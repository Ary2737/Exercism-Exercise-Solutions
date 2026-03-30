// INFO: Headers from the standard library should be inserted at the top via
#include <cmath>

using std::ceil;

// daily_rate calculates the daily rate given an hourly rate
double daily_rate(double hourly_rate) {
    return hourly_rate * 8;
}

// apply_discount calculates the price after a discount
double apply_discount(double before_discount, double discount) {
    double discountPercent = discount/100;
    return before_discount - (before_discount * discountPercent);
}

// monthly_rate calculates the monthly rate, given an hourly rate and a discount
// The returned monthly rate is rounded up to the nearest integer.
int monthly_rate(double hourly_rate, double discount) {

    double monthlyRate = daily_rate(hourly_rate) * 22;

    int netMonthlyAmount = (int) ceil(apply_discount(monthlyRate,discount));

    return netMonthlyAmount;
}

// days_in_budget calculates the number of workdays given a budget, hourly rate,
// and discount The returned number of days is rounded down (take the floor) to
// the next integer.
int days_in_budget(int budget, double hourly_rate, double discount) {
    double dailyRate = daily_rate(hourly_rate);

    int netDailyRate = (int) ceil(apply_discount(dailyRate,discount));
    
    return budget / netDailyRate;
}
