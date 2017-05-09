#include<iostream>
#include<assert.h>
#include<math.h>
using namespace std;
struct Node
{
    int Key;                        // 关键字
    Node *next;
};
struct HeadNode
{
Node *next;
};
class Hash
{
protected:
HeadNode *ht;                      // 散列表结头,存放的是指针而非具体的地址，只是提供一个索引而已
int p;                             // 除留余法的除数，可以作为是头结点指针索引的数量
int H(int Key);                    // 散列函数
public:
Hash(int divisor=0);
bool Search(const int &Key,Node *&Pre); // 查找关键字为Key的地址
bool Insert(const int &Key);
};
int Hash::H(int Key)
{
return Key%p;
}
Hash::Hash(int divisor)
{
p=divisor;
ht=new HeadNode[p];
for(int i=0;i<p;i++)
{
   ht[i].next=NULL;
}
}
bool Hash::Search(const int &Key,Node *&Pre){
    int pos=H(Key);
    Pre=ht[pos].next;
    while(Pre!=NULL){
        if(Pre->Key==Key){
            cout<<Pre->Key<<';';
            return true;
        }else{
            cout<<Pre->Key<<';';
            Pre = Pre->next;
        }
    }
    return false;
}

bool Hash::Insert(const int &Key)
{
int pos;
pos=H(Key);
Node *temp;
temp=new Node;
temp->Key=Key;
temp->next=ht[pos].next;
ht[pos].next=temp;
return true;
}
void Visit(Node *&elem)
{
cout<<elem->Key<<" ";
}

int main(void)
{
int divisor, Count,Key; //分别为 因子，数据个数，读入的数据
cin>>divisor;
cin>>Count;
Hash A(divisor); //创建存储结构初始状态
for (int i=0;i<Count;i++)
{
   cin>>Key;
   A.Insert(Key); //每个数据插入到链表中；
}

Node *p;
int whatwillfound;
cin>>whatwillfound;
cout<<"The visited values are :"<<endl;
if (A.Search(whatwillfound,p))
	cout<<endl<< p->Key<< " is found here"<<endl;
else
	cout<<endl<< whatwillfound<< " is not found" <<endl;
return 0;
}
