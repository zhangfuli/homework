#include "stdlib.h"
#include "iostream"
using namespace std ;

class List; //前视定义,否则友元无法定义
class LinkNode
{
 friend class  List; //链表结点类的定义
 private:
   LinkNode *link;
   char data;
 public:
   LinkNode (LinkNode *ptr = NULL)    {link=ptr;}
   LinkNode(const char & item, LinkNode *ptr = NULL){  data=item;link=ptr;}
   ~LinkNode(){}
};

class List
{//单链表类的定义
private:
    LinkNode *first; //指向首结点的指针
public:
    List ( ) { first = new LinkNode ( );}   // 带头结点
    ~List (){MakeEmpty();}         //析构函数
    void MakeEmpty ( );      //链表置空
     LinkNode * getHead() const {return first;}

    void input(char  endTag);
    void output();
	void process(List B,List C);
};
void List:: MakeEmpty ( )
 {
    LinkNode *q;
    while (  first->link != NULL )
	{q = first->link;
     first->link = q->link;//将表头结点后第一个结点从链中摘下
     delete q;        //释放它
    }
};
void List :: input (char endTag){
	LinkNode  *newnode; char val;
	cin>>val;
	while(val!=endTag)
	{
		newnode=new LinkNode (val);
  	    newnode->link=first->link;
		first->link=newnode;
		cin>>val;
	}
}
void List ::output ( )  {//依次输出各结点的值
    LinkNode  *p=first->link;
    while(p!=NULL)    {
          cout<<p->data;
          p=p->link;
          }
}
void List::process(List B,List C){
    LinkNode *p1 = first->link;
    LinkNode *p2 = B.first->link;
    LinkNode *p3 = C.first->link;
    char store[100];
    int i;
    for(i=0;i<100;i++){
        store[i]='#';
    }
    i=0;
    while(p1!=NULL){
        p2 = B.first->link;
        while((p2!=NULL)){
            if(p1->data==p2->data){
                p3 = C.first->link;
                while(p3!=NULL){
                    if(p2->data==p3->data){
                        store[i]=p2->data;
                        i++;
                    }
                    p3=p3->link;
                }
            }
            p2=p2->link;
        }
        p1 = p1->link;
    }
    MakeEmpty();
    for(i=100;i>=0;i--){
        if((store[i]!='#')){
            if((first->link==NULL)||(first->link->data!=store[i])){
                LinkNode *newNode = new LinkNode(store[i]);
                newNode->link = first->link;
                first->link = newNode;
            }
        }
    }
}
int main()
{
	List A,B,C ;
    A.input('0');
	B.input('1');
	C.input('2');
	A.process(B,C);
	A.output ();
        cout<<endl;
       return 0;
}
