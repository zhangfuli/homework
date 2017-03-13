#include <iostream>  
#include "stdlib.h"  
#include <iomanip>  
using namespace std;  
class List;  
class LinkNode{  
friend class List;  
public:  
    int coe;  
    int index;  
    LinkNode *link;  
    LinkNode(LinkNode *ptr = NULL){link = ptr;}  
    LinkNode(int c,int i,LinkNode *ptr = NULL){  
        coe = c;  
        index = i;  
        link = ptr;  
    }  
    ~LinkNode();  
};  
class List{  
public:  
    LinkNode *first;  
    int length;  
    List(){  
        first = new LinkNode();  
        length = 0;  
    }  
    void inSert(int coe,int index);  //后插法插入  
    void outPut();  
    void outPut(int x);  
    void Der();  
    int findOne(int x);  //找到index=x，返回其coe,没有返回0  
    LinkNode* locate(int x);  //找到index=x的位置,返回其地址,没有返回NULL  
    void updata (int i,int c); //修改某位置的值  
    void com(float x); //计算结果  
    void sort();  
};  
void List::inSert(int coe,int index){  
    LinkNode *newNode = new LinkNode(coe,index);  
    LinkNode *p = first;  
    for(int i=0;i<=length;i++){  
        if(p->link ==NULL){  
            p->link = newNode;  
            p = newNode;  
        }  
        p = p ->link;  
    }  
    length++;  
}  
void List::outPut(){  
    LinkNode *p = first->link;  
    int log = 0; //记录第一次  
    while(p!=NULL){  
        if(p->coe!=0){  
            if(log!=0){  
                if(p->index == 1){  
                     if(p->coe==1){  
                         cout<<"+x";  
                    }else if((p->coe)<0){  
                        cout<<p->coe<<"x";  
                    }else{  
                        cout<<"+"<<p->coe<<"x";  
                    }  
                }else if(p->index==0){  
                    if(p->coe==1){  
                         cout<<"+"<<p->coe;  
                    }else if((p->coe)<0){  
                        cout<<p->coe;  
                    }else{  
                        cout<<"+"<<p->coe;  
                    }  
                }else{  
                     if(p->coe==1){  
                         cout<<"+x^"<<p->index;  
                    }else if((p->coe)<0){  
                        cout<<p->coe<<"x^"<<p->index;  
                    }else{  
                        cout<<"+"<<p->coe<<"x^"<<p->index;  
                    }  
                }  
            }else{  
                if(p->index == 1){  
                     if(p->coe==1){  
                         cout<<"x";  
                    }else{  
                        cout<<p->coe<<"x";  
                    }  
                }else if(p->index==0){  
                    cout<<p->coe;  
                }else{  
                     if(p->coe==1){  
                         cout<<"x^"<<p->index;  
                    }else{  
                        cout<<p->coe<<"x^"<<p->index;  
                    }  
                }  
            }  
            log++;  
        }  
        p= p->link;  
    }  
}  
void List::sort(){  
    int indexItem,coeItem;  
    for(int i=0;i<length;i++){  
        LinkNode *p = first->link;  
        while(p->link!=NULL){  
            if( (p->index) > (p->link->index)){  
                indexItem = p->index;  
                p->index = p->link->index;  
                p->link->index = indexItem;  
  
                coeItem = p->coe;  
                p->coe = p->link->coe;  
                p->link->coe = coeItem;  
            }  
            p = p->link;  
        }  
    }  
}  
void List::Der(){  
    LinkNode *p = first->link;  
    int log = 0;  
    while(p!=NULL){  
        if(p->coe!=0){  
            if(log!=0){  
                if(p->index==1){  
                    if(p->coe==1){  
                         cout<<"+"<<p->coe*p->index;  
                    }else if(p->coe<0){  
                        cout<<p->coe*p->index;  
                    }else{  
                        cout<<"+"<<p->coe*p->index;  
                    }  
                }else if(p->index == 2){  
                    if(p->coe==1){  
                         cout<<"+"<<p->coe*p->index<<"x";  
                    }else if(p->coe<0){  
                        cout<<p->coe*p->index<<"x";  
                    }else{  
                        cout<<"+"<<p->coe*p->index<<"x";  
                    }  
                }else if(p->index==0){  
                }else{  
                   if(p->coe==1){  
                         cout<<"+"<<p->coe*p->index<<"x^"<<p->index-1;  
                    }else if(p->coe<0){  
                        cout<<p->coe*p->index<<"x^"<<p->index-1;  
                    }else{  
                        cout<<"+"<<p->coe*p->index<<"x^"<<p->index-1;  
                    }  
                }  
            }else{  
                if(p->index == 1){  
                     if(p->coe==1){  
                         cout<<p->coe*p->index;  
                    }else{  
                        cout<<p->coe*p->index;  
                    }  
                }else if(p->index == 2){  
                     if(p->coe==1){  
                         cout<<p->coe*p->index<<"x";  
                    }else{  
                        cout<<p->coe*p->index<<"x";  
                    }  
                }else if(p->index==0){  
                    log--;  
                }else{  
                    if(p->coe==1){  
                         cout<<p->coe*p->index<<"x^"<<p->index-1;  
                    }else{  
                        cout<<p->coe*p->index<<"x^"<<p->index-1;  
                    }  
                }  
  
            }  
            log++;  
        }  
        p= p->link;  
    }  
}  
int List::findOne(int x){  
    LinkNode *p = first->link;  
    while(p!=NULL){  
        if(p->index == x){  
            return p->coe;  
        }  
        p = p->link;  
    }  
    return 0;  
}  
LinkNode* List::locate(int x){  
    LinkNode *p = first->link;  
    while(p!=NULL){  
        if(p->index == x){  
            return p;  
        }  
        p = p->link;  
    }  
    return NULL;  
}  
void List::updata (int i,int c){  
    LinkNode *p = locate(i);  
    if(p!=NULL){  
        p->coe = c;  
    }  
}  
void List::com(float x){  
    float val = 1.0,sum=0.0;  
    LinkNode *p = first->link;  
    while(p!=NULL){  
        val = 1.0;  
        val = val*(p->coe);  
        for(int i=0;i<p->index;i++){  
            val = val*x;  
        }  
        sum=sum+val;  
        p=p->link;  
    }  
    cout<<setiosflags(ios::fixed)<<setprecision(2)<<sum<<endl;  
}  
void add(List list1,List list2,int maxindex){  
    List addlist;  
    int i;  
    for(i=0;i<=maxindex ;i++){  
        addlist.inSert(0,i);  
    }  
    for(i=0;i<=maxindex;i++){  
        addlist.updata(i,list1.findOne(i)+list2.findOne(i));  
    }  
    addlist.outPut();  
}  
void sub(List list1,List list2,int maxindex){  
    List sublist;  
    int i;  
    for(i=0;i<=maxindex ;i++){  
        sublist.inSert(0,i);  
    }  
    for(i=0;i<=maxindex;i++){  
        sublist.updata(i,list1.findOne(i)-list2.findOne(i));  
    }  
    sublist.outPut();  
}  
void mul(List list1,List list2){  
    List mullist;  
    int coe,index;  
    LinkNode *p1 = (list1.first)->link;  
    LinkNode *p2 = (list2.first)->link;  
    LinkNode *cur;  
    while(p1!=NULL){  
        while(p2!=NULL){  
            coe = (p1->coe)*(p2->coe);  
            index = (p1->index)+(p2->index);  
            if(mullist.findOne(index)==0){  
                mullist.inSert(coe,index);  
            }else{  
                cur = mullist.locate(index);  
                cur->coe = (cur->coe)+coe;  
            }  
            p2 = p2->link;  
        }  
        p2 = (list2.first)->link;  
        p1 = p1->link;  
    }  
    //排序  
    mullist.sort();  
    mullist.outPut();  
}  
  
int main(){  
    //C,P,S,M,D,V,C  
    List mylist1 ,mylist2;  
    int maxindex = 0;  
    int coe,index;  
    float data;  
    char commend;  
    while(1){  
        cin>>commend;  
         if(commend == 'C'){  
           while(true){  
                cin>>coe;  
                if(coe == 0){  
                    break;  
                }else{  
                    cin>>index;  
                    if(index>maxindex){maxindex = index;}  
                    mylist1.inSert(coe,index);  
                }  
            }  
            while(true){  
                cin>>coe;  
                if(coe == 0){  
                    break;  
                }else{  
                    cin>>index;  
                    if(index>maxindex){maxindex = index;}  
                    mylist2.inSert(coe,index);  
                }  
            }  
        }else if(commend == 'P'){  
            cout<<"C(x)=";  
            add(mylist1,mylist2,maxindex);  
            cout<<endl;  
        }else if(commend == 'S'){  
            cout<<"C(x)=";  
            sub(mylist1,mylist2,maxindex);  
            cout<<endl;  
        }else if(commend == 'M'){  
            cout<<"C(x)=";  
            mul(mylist1,mylist2);  
            cout<<endl;  
        }else if(commend == 'D'){  
            cout<<"C(x)=";  
            mylist1.Der();  
            cout<<endl;  
        }else if(commend == 'V'){  
            cin>>data;  
            mylist1.com(data);  
        }else{  
            break;  
        }  
    }  
    return 0;  
}  