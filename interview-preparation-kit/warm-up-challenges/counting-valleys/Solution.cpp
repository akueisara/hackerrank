#include <bits/stdc++.h>

using namespace std;

// Complete the countingValleys function below.
int countingValleys(int n, string s) {
    int count = 0, sealevel = 0;
    char char_array[n + 1];
    strcpy(char_array, s.c_str());
    for (int i = 0; i < n; i++) {
        if(char_array[i] == 'D') {
            sealevel--;
        } else {
            sealevel++;
        }
        if(sealevel == 0 && char_array[i] == 'U') {
            count++;
        }
    }
    return count;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    string s;
    getline(cin, s);

    int result = countingValleys(n, s);

    fout << result << "\n";

    fout.close();

    return 0;
}