#include <iostream>

using namespace std;

class BinaryTree;
class BinTreeNode{
friend class BinaryTree;
private:
    char data;
    BinTreeNode *left;
    BinTreeNode *right;
public:
    BinTreeNode(){left = NULL;right = NULL;}
    BinTreeNode(char d,BinTreeNode *l=NULL,BinTreeNode *r=NULL){
        data = d;
        left = l;
        right = r;
    }
};
class BinaryTree{
public:
    BinaryTree(){root = NULL;endTag='@';maxsize = 0;}
    BinaryTree(char d){data = d;root = NULL;endTag='@';maxsize = 0;}
    void createTree(){createTree(root);}
    void inorder(){inorder(root);}
    int com(){return com(root);}
private:
    BinTreeNode *root;
    char endTag;
    int data;
    char kuo[10];
    int maxsize;
    void createTree(BinTreeNode *&root);
    void inorder(BinTreeNode *root);
    int com(BinTreeNode *root);
};
void BinaryTree::createTree(BinTreeNode *&subTree){
    char data;
    cin>>data;
    if(data!=endTag){
        subTree = new BinTreeNode(data);
        createTree(subTree->left);
        createTree(subTree->right);
    }

}

void BinaryTree::inorder(BinTreeNode *subTree){
    if(subTree!=NULL){
        if(subTree->data=='*'||subTree->data=='/'){
            if(subTree->left->data=='+'||subTree->left->data=='-'){
                cout<<"(";
                inorder(subTree->left);
                cout<<")";
            }else{
                inorder(subTree->left);
            }
            cout<<subTree->data;
            if(subTree->right->data=='+'||subTree->right->data=='-'){
                cout<<"(";
                inorder(subTree->right);
                cout<<")";
            }else{
                inorder(subTree->right);
            }
        }else{
            inorder(subTree->left);
            cout<<subTree->data;
             inorder(subTree->right);
        }
    }
}
int BinaryTree::com(BinTreeNode *subTree){
   if(subTree!=NULL){
        if(subTree->data == '+'){
            return com(subTree->left)+com(subTree->right);
        }
            else if(subTree->data == '-'){
                return com(subTree->left)-com(subTree->right);
            }
            else if(subTree->data == '*'){
                return com(subTree->left)*com(subTree->right);
            }
            else if(subTree->data == '/'){
                return com(subTree->left)/com(subTree->right);
            }
            else{
                return subTree->data - '0';
            }
       }

}

int main()
{
    BinaryTree bt;
    bt.createTree();
    bt.inorder();
    cout<<"="<<bt.com()<<endl;


    return 0;
}
