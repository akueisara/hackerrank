#include <iostream>

using namespace std;

int main() {
    cout << "5" << endl;
    cout << "4 3" << endl;
    cout << "0 -3 4 2" << endl;
    cout << "5 2" << endl;
    cout << "0 -3 4 2 2" << endl;
    cout << "3 3" << endl;
    cout << "0 -3 4" << endl;
    cout << "7 2" << endl;
    cout << "0 -3 1 1 1 1 1" << endl;
    cout << "6 3" << endl;
    cout << "0 -3 4 2 1 1" << endl;
    
    int t, n, k;
    cin >> t;
    for (int i=0;i<t;i++) {
        cin >> n >> k;
        int arrive =0;
        int a[n];
        for (int j=0;j<n;j++) {
            cin >> a[j];
            if (a[j]<=0)
                arrive++;
        }
        if (arrive>=k)
            cout << "NO" << endl;
        else
            cout << "YES" << endl;
    }
}