#include <iostream>

using namespace std;

class Graph{
private:
    char *Vertice;
    int **Edge;
    int numVertice;
    int maxVertice;
    int numEdges;
    int maxWeight;
public:
    Graph(int vnum , int maxWight);
    void printGraph();
    void setVertice();
    void setEdge(int sz);
    void BFS();
    char getVertice(int v){return Vertice[v];}
    int getNumVertices(){return maxVertice;}
    int getFirstNeighbor(int v);
    int getNextNeighbor(int v,int w);
    void printEdges();
};

Graph::Graph(int vnum , int m){
    //cout<<vnum<<" "<<maxWight;
    numEdges =0; numVertice = 0;
    maxWeight = m;
    maxVertice = vnum;
    Vertice = new char[vnum];
    Edge = new int*[vnum];
    for(int i=0;i < vnum;i++){
        Edge[i] = new int[vnum];
    }
    for(int i=0;i<vnum;i++){
        for(int j=0;j<vnum;j++){
            Edge[i][j] = (i==j) ? 0:m;
        }
    }
}
void Graph::printGraph(){
    for(int i=0;i<maxVertice;i++){
        for(int j=0;j<maxVertice;j++){
            cout<<Edge[i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<"Vertice"<<endl;
    for(int i=0;i<maxVertice;i++){
        cout<<Vertice[i]<<" ";
    }
    cout<<endl;
}
void Graph::setVertice(){
    for(int i=0;i<maxVertice;i++){
        cin>>Vertice[i];
    }
}
void Graph::setEdge(int sz){
    int row,col,data;
    for(int i=0; i<sz ; i++){
        cin>>row>>col>>data;
        Edge[row][col] = data;
        Edge[col][row] = data;
    }
}
void Graph::BFS(){
    int *aid = new int[maxVertice];
    int *copy = new int [maxVertice];
    int logo = 0,c=1;
    for(int i=0;i<maxVertice;i++){aid[i]=0;copy[i]=0;}
    aid[logo]++;
    for(int i=0;i < maxVertice;i++){
        logo = copy[i];
        for(int j=0;j<maxVertice;j++){
            if(Edge[logo][j]!=0&&Edge[logo][j]!=maxWeight&&aid[j]==0){
                copy[c] = j;
                c++;
                aid[j]++;
            }
        }
    }
    for(int i=0;i<maxVertice;i++)
        cout<<Vertice[copy[i]]<<" ";

}
int Graph::getFirstNeighbor(int v){
     int i;
        for(i=0;i<maxVertice;i++){
            if(Edge[v][i]!=0&&Edge[v][i]!=maxWeight){
                return i;
            }
        }
        return -1;
}
int Graph::getNextNeighbor(int v,int w){
    int i,j=0;
        for(i=w;i<maxVertice;i++){
            if(Edge[v][i]!=0&&Edge[v][i]!=maxWeight){
                if(j==1){
                    return i;
                }
                j++;
            }
        }
        return -1;

}
void DFS2(Graph* &G,int v,bool visited[]);
void DFS(Graph* &G, const int &v){
    int i, loc, n = G->getNumVertices();    //顶点个数
    bool *visited = new bool[n];          //创建辅助数组
   	for (i = 0; i < n; i++) visited [i] = false;
      				      //辅助数组visited初始化
	loc = 0; //取得起始结点的下标
    DFS2 (G, loc, visited); //从顶点v开始深度优先搜索
}
void DFS2(Graph* &G,int v,bool visited[]){
    cout << G->getVertice(v) << ' ';
    visited[v] = true;	 	      //作访问标记
    int w = G->getFirstNeighbor (v);  //第一个邻接顶点
   	while (w != -1) {	                //若邻接顶点w存在
 	    if ( !visited[w] ) DFS2(G, w, visited);
	    w = G->getNextNeighbor (v, w); //下一个邻接顶点
    }

}
void Graph::printEdges(){
    for(int i=0;i<maxVertice;i++){
        for(int j=i+1;j<maxVertice;j++){
            if(Edge[i][j]!=maxWeight){
                cout<<Vertice[i]<<'-'<<Vertice[j]<<':'<<Edge[i][j]<<endl;
            }
        }
    }
}
int main()
{
    int edges,setedge;
    cin>>edges;
    Graph *mygraph = new Graph(edges,100);
    mygraph->setVertice();
    cin>>setedge;
    mygraph->setEdge(setedge);

    cout<<"DFS:";
    DFS(mygraph,0);
    cout<<endl;
    cout<<"BFS:";
    mygraph->BFS();
    cout<<endl;
    cout<<"edges are:"<<endl;
     mygraph->printEdges();
    return 0;
}
