#include <iostream>

using namespace std;

struct Triple{
    int row,col,value;
    void setTriple(int r,int c,int v){row = r;col = c;value = v;}
    void output(){
        cout<<row<<" "<<col<<" "<<value<<endl;
    }
};
class SparseMatrix{
private:
    int rows,cols,non;

public:
    Triple *smArray;
    SparseMatrix(int r,int c,int n){
        rows=r;
        cols=c;
        non=n;
        smArray = new Triple[non];
    }
    void setArray();
    void output();
    void transport();
    int getNon(){return non;}
};
void SparseMatrix::setArray(){
    int row,col,value;
    for(int i=0;i<non;i++){
        cin>>row>>col>>value;
        smArray[i].setTriple(row,col,value);
    }
}
void SparseMatrix::output(){
    for(int i=0;i<non;i++){
        smArray[i].output();
    }
}
void SparseMatrix::transport(){
    SparseMatrix *store = new SparseMatrix(rows,cols,non);
    int *rowSize = new int[cols];
    int *rowStart = new int [cols];
    for(int i = 0;i < cols; i++){rowSize[i] = 0;}
    for(int i= 0;i<non;i++) rowSize[smArray[i].col]++;
    rowStart[0] = 0;
    for(int i = 1;i< cols; i++){
        rowStart[i] = rowStart[i-1]+rowSize[i-1];
    }
    for(int i=0;i<non;i++){
        int j = rowStart[smArray[i].col];
        store->smArray[j].row = smArray[i].col;
        store->smArray[j].col = smArray[i].row;
        store->smArray[j].value = smArray[i].value;
        rowStart[smArray[i].col]++;
    }
    store->output();
}
void add(SparseMatrix *a,SparseMatrix *b){
    int length = a->getNon() + b->getNon();
    Triple *triC = new Triple[length+1];
    for(int i=0;i<length+1;i++){triC[i].setTriple(0,0,0);}
    int i=1,j=0,countC=0;
    while(i<=a->getNon()){
        while(j<b->getNon()){
            i--;
            if(a->smArray[i].row == b->smArray[j].row){
                if(a->smArray[i].col==b->smArray[j].col){
                    triC[countC].setTriple(a->smArray[i].row,a->smArray[i].col,a->smArray[i].value + b->smArray[j].value);
                    i++;
                    j++;
                    countC++;
                    break;
                }else if(a->smArray[i].col>b->smArray[j].col){
                    triC[countC].setTriple(b->smArray[j].row,b->smArray[j].col,b->smArray[j].value);
                    j++;
                    countC++;
                    break;
                }else{
                    triC[countC].setTriple(a->smArray[i].row,a->smArray[i].col,a->smArray[i].value);
                    i++;
                    countC++;
                    break;
                }
            }else if(a->smArray[i].row > b->smArray[j].row){
                triC[countC].setTriple(b->smArray[j].row,b->smArray[j].col,b->smArray[j].value);
                j++;
                countC++;
                break;
            }else{
                triC[countC].setTriple(a->smArray[i].row,a->smArray[i].col,a->smArray[i].value);
                i++;
                countC++;
                break;
            }
        }
        i++;
    }
    i=i-2;
    if(i<a->getNon()){
        for(;i<a->getNon();i++){
            triC[countC].setTriple(a->smArray[i].row,a->smArray[i].col,a->smArray[i].value);
            countC++;
        }
    }
    for(i=0;i<length+1;i++){
        if(triC[i].value!=0){
            triC[i].output();
        }
    }
}
int main()
{
    int cols,rows,non;
    cin>>cols>>rows>>non;
    SparseMatrix *triA = new SparseMatrix(rows,cols,non);
    triA->setArray();
    cout<<"The transformed matrix  is:"<<endl;
    triA->transport();
    cin>>cols>>rows>>non;
    SparseMatrix *triB = new SparseMatrix(rows,cols,non);
    triB->setArray();
    cout<<"The added matrix is:"<<endl;
    add(triA,triB);
    return 0;
}
