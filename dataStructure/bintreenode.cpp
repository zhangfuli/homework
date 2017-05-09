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
    BinaryTree(){root = NULL;endTag='#';}
    BinaryTree(char d){data = d;root = NULL;endTag='#';}
    void createTree(){createTree(root);}
    void output(int counter){output(root,counter);}
    int height(){int h=height(root);return h;}
    int leaf(){int l=leaf(root);return l;}
    int node(){int n = node(root);return n;}
    void preorder(){preorder(root);}
    void inorder(){inorder(root);}
    void postorder(){postorder(root);}
    int count(char d){int c=count(root,d);return c;}
private:
    BinTreeNode *root;
    char endTag;
    int data;
    void createTree(BinTreeNode *&root);
    void output(BinTreeNode *root,int counter);
    int height(BinTreeNode *root);
    int leaf(BinTreeNode *root);
    int node(BinTreeNode *root);
    void preorder(BinTreeNode *root);
    void inorder(BinTreeNode *root);
    void postorder(BinTreeNode *root);
    int count(BinTreeNode *root,char d);
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
void BinaryTree::output(BinTreeNode *subTree,int counter){
    counter++;
    if(subTree!=NULL){
        for(int i=0;i<2*counter;i++){
            cout<<" ";
        }
        cout<<subTree->data<<endl;
        output(subTree->left,counter);
        output(subTree->right,counter);
    }
}
int BinaryTree::height(BinTreeNode *subTree){
    if(subTree==NULL){return 0;}
    else{
        return 1+max(height(subTree->left),height(subTree->right));
    }
}
int BinaryTree::leaf(BinTreeNode *subTree){
    if(subTree==NULL){return 0;}
    else{
        if(subTree->left==NULL&&subTree->right==NULL)
            return 1+leaf(subTree->left)+leaf(subTree->right);
        else
            return leaf(subTree->left)+leaf(subTree->right);
    }
}
int BinaryTree::node(BinTreeNode *subTree){
    if(subTree == NULL){return 0;}
    else{
        return 1+node(subTree->left)+node(subTree->right);
    }
}
void BinaryTree::preorder(BinTreeNode *subTree){
    if(subTree!=NULL){
        cout<<subTree->data<<" ";
        preorder(subTree->left);
        preorder(subTree->right);
    }
}
int BinaryTree::count(BinTreeNode *subTree,char d){
    if(subTree==NULL){return 0;}
    else{
        if(subTree->data==d){
            return 1+count(subTree->left,d)+count(subTree->right,d);
        }else{
            return count(subTree->left,d)+count(subTree->right,d);
        }
    }
}
void BinaryTree::inorder(BinTreeNode *subTree){
    if(subTree!=NULL){
        inorder(subTree->left);
        cout<<subTree->data<<" ";
        inorder(subTree->right);
    }
}
void BinaryTree::postorder(BinTreeNode *subject){
    if(subject!=NULL){
        postorder(subject->left);
        postorder(subject->right);
        cout<<subject->data<<" ";
    }
}
int main()
{
    char commend;
    BinaryTree bt;
    while(1){
        cin>>commend;
        if(commend=='C'){
            bt.createTree();
            cout<<"Created success!"<<endl;
        }
        if(commend=='H'){
            cout<<"Height="<<bt.height()<<"."<<endl;
        }
        if(commend=='L'){
            cout<<"Leaf="<<bt.leaf()<<"."<<endl;
        }
        if(commend=='N'){
            cout<<"Nodes="<<bt.node()<<"."<<endl;
        }
        if(commend=='1'){
            cout<<"Preorder is:";
            bt.preorder();
            cout<<"."<<endl;
        }
        if(commend=='2'){
            cout<<"Inorder is:";
            bt.inorder();
            cout<<"."<<endl;
        }
        if(commend=='3'){
            cout<<"Postorder is:";
            bt.postorder();
            cout<<"."<<endl;
        }
        if(commend=='F'){
            char d;
            cin>>d;
            cout<<"The count of "<<d<<" is "<<bt.count(d)<<"."<<endl;
        }
        if(commend=='P'){
            cout<<"The tree is:"<<endl;
            bt.output(-1);
            break;
        }

    }

    return 0;
}
