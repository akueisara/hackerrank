#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int N, Q;
    cin >> N >> Q;
    vector<int> seqList[N];
    int lastAns = 0;
    for(int i=0;i<Q;i++) {
        int choose, x, y;
        cin >> choose >> x >> y; 
        int pos = (x^lastAns)%N;
        if(choose == 1) {
                seqList[pos].push_back(y);
            }
            else if(choose == 2){
                int index = y%((int)seqList[pos].size());
                lastAns = seqList[pos][index];
                cout << lastAns << endl;
            }
    }
    return 0;
}