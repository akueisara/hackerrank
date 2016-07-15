#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n,d;
    cin >> n >> d ;
    int array[n];
    for(int i=0; i<n;i++) {
       cin >> array[(i+n-d)%n];
    }
    for(int i=0; i<n;i++) {
        cout << array[i] << " ";
    }  
    return 0;
}
