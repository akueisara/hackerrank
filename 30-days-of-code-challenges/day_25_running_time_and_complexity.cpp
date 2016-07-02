#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool isPrime(int);


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int t,i;
    cin >> t;
    for(i=0;i<t;i++){
        int n;
        cin >> n;
        if(isPrime(n)) {
            cout << "Prime" << endl;
        }
        else
            cout << "Not prime" << endl;
    }
    return 0;
}

bool isPrime(int n) {
    if (n < 2)
        return false;
    else{
        for(int i=2;i<=(int)sqrt(n);i++) {
            if(n%i==0)
                return false;
        }
    }
    return true;
}