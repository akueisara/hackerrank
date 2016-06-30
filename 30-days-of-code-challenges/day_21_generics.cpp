#include <iostream>
#include <vector>

using namespace std;

// Add your code here
template<typename T> 
void printArray(vector<T> array) {
     for(T i : array){
          cout << i << endl;
     }
}

int main() {
  
    vector<int> vInt{1, 2, 3};
    vector<string> vString{"Hello", "World"};
    
    printArray<int>(vInt);
    printArray<string>(vString);
    
    return 0;
}