#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int day_a, month_a, year_a, day_e, month_e, year_e;
    cin >> day_a >> month_a >> year_a;
    cin >> day_e >> month_e >> year_e;
    int fine = 0;
    if (day_a > day_e && month_a == month_e && year_a == year_e)
        fine = (day_a - day_e) * 15;
    if (month_a > month_e && year_a == year_e)
        fine = (month_a - month_e) * 500;
    if (year_a > year_e)
        fine = 10000;
    cout << fine << endl;
    
    return 0;
}
