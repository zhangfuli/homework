#include <iostream>  
#include "stdlib.h"  
using namespace std;  
class List;  
class LinkNode{  
    friend class List;  
private :  
    int data;  
    LinkNode *link;  
public:  
    LinkNode(LinkNode* addr = NULL){link = addr;}  
    LinkNode(int &item ,LinkNode* addr = NULL){link = addr;data = item;}  
};  
class List {  
private :  
    LinkNode *first;  
    int length;  
public:  
    List(){  
        first = new LinkNode();  
        length = 0;  
    }  
    void inSert(int x);  
    void outPut();  
    void sort();   //实现链表的升序  
    bool findOne(int x);   //找到链表中某data，找到返回true，找不到返回false  
};  
void List::inSert(int x){  
    LinkNode *newNode = new LinkNode(x);  
    newNode->link = first->link;  
    first->link = newNode;  
    length++;  
}  
void List::outPut(){  
    LinkNode* p = first->link;  
    while(p!=NULL){  
        cout<<p->data<<endl;  
        p = p->link;  
    }  
}  
bool List::findOne(int x){  
    LinkNode *p = first->link;  
    while(p!=NULL){  
        if(p->data==x){  
            return true;  
        }  
        p = p->link;  
    }  
    return false;  
}  
void List::sort(){  
    int dataItem;  
    for(int i=0;i<length;i++){  
        LinkNode *p = first->link;  
        while(p->link!=NULL){  
            if( (p->data) > (p->link->data)){  
                dataItem = p->data;  
                p->data = p->link->data;  
                p->link->data = dataItem;  
            }  
            p = p->link;  
            // cout<<p->data<<endl;  
        }  
    }  
  
}  
int main()  
{  
    List list1;  
    int length1,count,data;  
    cin>>length1;  
    for(count=0;count<length1;count++){  
        cin>>data;  
        list1.inSert(data);  
    }  
    int length2;  
    cin>>length2;  
    for(count=0;count<length2;count++){  
        cin>>data;  
        if(!list1.findOne(data)){  
            list1.inSert(data);  
        }  
    }  
    list1.sort();  
    list1.outPut();  
    return 0;  
}  