//http://acm.hdu.edu.cn/discuss/problem/post/reply.php?postid=31174&messageid=1&deep=0
#include<cstdio>
#include<memory.h>
#include<algorithm>
#include<queue>
using namespace std;
class Point{
	public:
		Point(int a, int b, int c):x(a),y(b),z(c){}
		Point(){}
		int x,y,z;
};

char Map[11][11][11];
bool vis[10][10][10];
int dis[10][10][10],N;
Point start,End;
const int dir[][3] = {0,-1,0,-1,0,0,0,1,0,1,0,0,0,0,1,0,0,-1};
void bfs(){
	
	int i,j,k,x,y,z;
	queue<Point>q;
	Point now;
	memset(dis,0x3f,sizeof(dis));
	memset(vis,0,sizeof(vis));
	vis[start.x][start.y][start.z] = 1;
	dis[start.x][start.y][start.z] = 0;
	q.push(start);
	while(!q.empty()){
		now = q.front();
		q.pop();
		vis[now.x][now.y][now.z] = 0;
		for(int i = 0; i < 6; i++){
			x = now.x+dir[i][0];
			y = now.y+dir[i][1];
			z = now.z+dir[i][2];
			if(x<0||y<0||z<0||x>=N||y>=N||z>=N||Map[x][y][z]=='X') continue;
			if(dis[x][y][z] > dis[now.x][now.y][now.z]+1){
				dis[x][y][z]=dis[now.x][now.y][now.z]+1;
				if(!vis[x][y][z]){
					vis[x][y][z] = 1;
					q.push(Point(x,y,z));
				}
			}
		}
	}
}

int main(){
	int i,j,k,x,y,z;
	char orders[11],w;
	while(~scanf("%s %d",orders,&N)){
		getchar();
		for(i = 0; i < N; i++){
			for(j = 0; j < N; j++){
				for(k = 0; k < N; k++){
					scanf("%c",&Map[j][k][i]);
				}
				getchar();
			}
		}
		
		scanf("%d %d %d",&x,&y,&z),swap(x,y);
		start=Point(x,y,z);
		scanf("%d %d %d",&x,&y,&z),swap(x,y);
		End = Point(x,y,z);
		getchar();
		gets(orders);
		bfs();
		if(dis[End.x][End.y][End.z] == 0x3f3f3f3f){
			puts("NO ROUTE");
		}
		else{
			printf("%d %d\n",N,dis[End.x][End.y][End.z]);
		}
	}
	return 0;
}
