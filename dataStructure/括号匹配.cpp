#include <iostream>
#include "stdlib.h"

using namespace std;
class Stack;
class StackNode{
    friend class Stack;
    char data;
    StackNode *link;
public:
    StackNode(StackNode *l =NULL);
    StackNode(char d, StackNode *l=NULL){data = d; link = l;}
    ~StackNode();
};
class Stack{
    StackNode *top;
    int length;
public:
    Stack(StackNode *t=NULL){top=t;length=-1;}
    void push(char d);
    void outPut();
    char pop();   //弹出最顶上的一个
    int getlength(){return length;}
};
void Stack::push(char d){
    StackNode *newNode = new StackNode(d);
    newNode->link = top;
    top = newNode;
    length++;
}
void Stack::outPut(){
    StackNode *p= top;
    while(p!=NULL){
        cout<<p->data<<endl;
        p = p->link;
    }
}
char Stack::pop(){
    StackNode *p = top;
    top = top->link;
    length--;
    return p->data;
}
int match(char left,char right){
    if((left =='('&&right==')')||(left =='{'&&right=='}')
       ||(left =='['&&right==']')||(left =='<'&&right=='>')){
       return 1;
    }else{
        return 0;
    }
}
void loss(char l){
    switch (l){
        case '{':{cout <<"}";break;}
        case '(':{cout <<")";break;}
        case '<':{cout <<">";break;}
        case '[':{cout <<"]";break;}
    }
}
int main(){
    Stack mystack;
     mystack.push('#');
    char data;
    int count=0;
    while(1){
        cin>>data;
        if(data!= '#'){
            count++;
            if(data=='{'||data=='['||data=='('||data=='<'){
                mystack.push(data);
            }
            if(data=='}'||data==']'||data==')'||data=='>'){
                if(match(mystack.pop(),data)){

                }else{
                    cout<<"The "<<count<<" character '"<<data<<"' is wrong."<<endl;
                    return 0;
                }
            }
        }else{
            break;
        }
    }
    if(mystack.getlength()>0){
        cout<<"loss of right character ";
        while(mystack.getlength()>=1){
            loss(mystack.pop());
        }
        cout<<"."<<endl;
    }else{
        cout<<"right"<<endl;
    }
    return 0;
}
//({()#
