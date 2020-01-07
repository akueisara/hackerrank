#include <bits/stdc++.h>

using namespace std;

// Complete the repeatedString function below.
long repeatedString(string s, long n) {
    int aCountInS = 0, aCountInTheLastS = 0;
    char char_array[s.length() + 1];
    strcpy(char_array, s.c_str());
    for(int i=0; i < s.length(); i++) {
        if (char_array[i] == 'a') {
            aCountInS++;
            if(i < n % s.length()) {
                aCountInTheLastS++;
            }
        }
    }
    return (n / s.length()) * aCountInS + aCountInTheLastS;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    long n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    long result = repeatedString(s, n);

    fout << result << "\n";

    fout.close();

    return 0;
}