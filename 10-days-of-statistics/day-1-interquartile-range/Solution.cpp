#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;

double getMedian(vector<int> a, int start, int end) {
    double median = 0;
    int size = end - start + 1;
    if (size % 2 == 0) {
        median = (a[start + size / 2 - 1] + a[start + size / 2]) / 2;
    }
    else {
        median = a[start + (size - 1) / 2];
    }
    return median;
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];
    for(int i = 0; i < n; i++) {
        int element = a[i];
        int frequency;
        cin >> frequency;
        while(frequency-- > 1) {
            a.push_back(element);
        }
    }
    sort(a.begin(), a.end());
    double Q1, Q2, Q3;
    n = a.size();
    Q1 = getMedian(a, 0, n / 2 - 1);
    Q2 = getMedian(a, 0, n - 1);
    if (n % 2 == 0) {
        Q3 = getMedian(a, n / 2, n - 1);
    } else {
        Q3 = getMedian(a, n / 2 + 1, n - 1);
    } 
    cout << fixed << setprecision(1) << Q3-Q1 << endl;
    
    return 0;
}