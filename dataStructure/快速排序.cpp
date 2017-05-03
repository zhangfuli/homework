#include<iostream>
using namespace std;
void quickSort(int a[],int,int);
void quickSort(int a[],int first,int len){
    int *l = &a[first];
    int *h = &a[len];
    int temp;
    int *p;
    p = l;
    while(l<h){
        if(*p<*h){
            h = h-1;
            p = l;
        }else if(*p>*h){
            cout<<*p<<"<---->"<<*h<<endl;
             temp = *p;
            *p = *h;
            *h = temp;
            p = h;
            l = l+1;
        }else if(*p<*l){
             cout<<*p<<"<---->"<<*l<<endl;
            temp = *p;
            *p = *l;
            *l = temp;
            p = l;
            h = h-1;
        }else if(*p>*l){
            l = l+1;
            p = h;
        }

    }
    if(p-1>&a[0]){
        quickSort(a,0,p-1-&a[0]);
    }
    if(p+1-&a[0]<len){
        quickSort(a,p+1-&a[0],len);
    }



}
int main()
{
	int len,k;
	cin>>len; //输入需要排序的数据个数；
	int *array=new int[len];
	for(k=0;k<len;k++) cin>>array[k];
	cout<<"The orginal array are:"<<endl;
	for(k=0;k<len;k++)
		cout<<array[k]<<" ";
	cout<<endl;
	cout<<"The processing is:"<<endl;
	quickSort(array,0,len-1);
	cout<<"The sorted array are:"<<endl;
	for(k=0;k<len;k++)
		cout<<array[k]<<" ";
	cout<<endl;
	return 0;
}
