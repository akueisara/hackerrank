#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int getMedian(vector<int> a, int start, int end) {
    int median = 0;
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
    sort(a.begin(), a.end());
    cout << getMedian(a, 0, n / 2 - 1) << endl;
    cout << getMedian(a, 0, n - 1) << endl;
    if (n % 2 == 0) {
        cout << getMedian(a, n / 2, n - 1) << endl;
    }
    else {
        cout << getMedian(a, n / 2 + 1, n - 1) << endl;
    }
}