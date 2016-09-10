#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

double getMean(const vector<int> &array)
{
    int sum = 0;
    for (int i = 0; i < array.size(); ++i)
        sum += array[i];
    double mean = (double)(sum) / array.size();
    return mean;
}

double getMedian(const vector<int> &array) {
    double median = 0;
    int size = array.size();
    vector<int> copy (array.size());
    copy = array;
    sort (copy.begin(), copy.end());  
    if(size % 2 == 0)
        median = (double) (copy[size/2 - 1] + copy[size/2]) / 2;
    else {
        median = (double) copy[(size-1)/2];
    }
        return median;
}

int getMode(const vector<int> &array) {
    int mode = 0;
    int size = array.size();
    int count = 0, max = 0;
    vector<int> copy (array.size());
    copy = array;
    sort (copy.begin(), copy.end());  
    int current = 0;
    for(int i = 0;i < size;i++) {
       if (copy[i] == current) {
           count++;
       } else {
           count = 1;
           current = copy[i];
       }
       if (count > max) {
           max = count;
           mode = copy[i];
       }
     }
     return mode;
}

int main() {
    int size;
    cin >> size;
    vector<int> a(size);
    for (int i = 0;i < size;i++) 
        cin >> a[i];
    cout << getMean(a) << endl;
    cout << getMedian(a) << endl;
    cout << getMode(a) << endl;
    return 0;
}