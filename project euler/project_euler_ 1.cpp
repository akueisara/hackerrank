#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int t;
    cin >> t;
    for(int i=0;i<t;i++) {
        int n;
        cin >> n;
        unsigned long int NumberOfThree = ((n-1) - (n-1)%3)/3;
        unsigned long int sum_three = 3 * NumberOfThree * (NumberOfThree + 1) /2;
        unsigned long int NumberOfFive = ((n-1) - (n-1)%5)/5;
        unsigned long int sum_five = 5 * NumberOfFive * (NumberOfFive + 1) /2;
        unsigned long int NumberOfFifteen = ((n-1) - (n-1)%15)/15;
        unsigned long int sum_fifteen = 15 * NumberOfFifteen * (NumberOfFifteen + 1) /2;
        cout << sum_three + sum_five - sum_fifteen << endl;
            
    }
    return 0;
}
