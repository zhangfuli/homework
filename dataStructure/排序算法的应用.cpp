#include "assert.h"
#include <iostream>
using namespace std;

void excg(int *a,int *b){
    int *temp =  new int;
    *temp = *a;
    *a = *b;
    *b = *temp;
}
void Sort(int a[],int n){
    int *start,*active,*last;
    start = &a[0];
    last = &a[n-1];
    active = start  ;

        while(active<=last){
            if(*active==2){
                active = active+1;

            }else if(*active == 3){
                    if(active-&a[0]!=last-&a[0]){
                        cout<<active-&a[0]<<"<--->"<<last-&a[0]<<endl;
                    }
                    excg(active,last);
             //   active = active + 1;
                    last = last - 1;



            }else{
                if(active-&a[0]!=start-&a[0]){
                        cout<<start-&a[0]<<"<--->"<<active-&a[0]<<endl;
                    }

                    excg(active,start);
                    active = active + 1;
                    start = start + 1;

            }
        }


    for(int i=0;i<n;i++){
        cout<<a[i];
    }
    cout<<endl;
}







int main() {
	int n;
	cin >> n;
	int * a= new int[n];
	for (int i=0;i<n;i++)
		cin>>a[i];
	Sort(a,n);
}
