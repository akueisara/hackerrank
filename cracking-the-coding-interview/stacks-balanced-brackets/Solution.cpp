#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

bool is_balanced(string expression) {
    stack <char> stack;
    for (int i = 0; i < expression.length(); i++) {
        char next = expression[i];

        if (next == '(' || next == '[' || next == '{') {
			stack.push(next);
        }
		
        if (next == ')' || next == ']' || next == '}') {
			if(stack.empty()) {
				return false;
			}
			char top = stack.top();
			stack.pop();
			if(next == ')' && top != '(') {
				return false;
			}
            if(next == ']' && top != '[') {
				return false;
			}
            if(next == '}' && top != '{') {
				return false;
			}
        }
    }

    // Printing answer, write your code here
	if(stack.empty())
		return true;

    return false;
}

int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        string expression;
        cin >> expression;
        bool answer = is_balanced(expression);
        if(answer)
            cout << "YES\n";
        else cout << "NO\n";
    }
    return 0;
}
