/* 
The structure of the node is

typedef struct node
{
    int freq;
    char data;
    node * left;
    node * right;
    
}node;

*/


void decode_huff(node * root,string s)
{
    node * curr = root;
    for(int i=0; i< s.size(); i++) {
        char c = s[i];
        if(c == '0') {
            curr = curr->left;
        } else {
            curr = curr->right;
        }
        if (curr->data != '\0') {
            cout << curr->data;
            curr = root;
        }
    }
}