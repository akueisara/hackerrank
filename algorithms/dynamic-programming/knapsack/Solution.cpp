#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int t;
    cin >> t;
    for(int i=0;i<t;i++){
        int n, k;
        cin >> n >> k;
        int cost[n];
        for(int j=0;j<n;j++) {
            cin >> cost[j];
        }
        int c[k+1];
        memset(c, 0, sizeof(c));
        for(int j=0;j<n;j++)
            for(int z=cost[j];z<=k;z++)
                c[z] = max(c[z], c[z-cost[j]]+cost[j]);
        cout << c[k] << endl;
    }
    return 0;
}