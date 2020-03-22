/**
Ã‚Ω‚:https://www.cnblogs.com/shenben/p/5575387.html 
**/
#include<cstdio>
#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;
#define N 100010
int step[N],vis[N];
queue <int>q;

int bfs(int n, int k){
	int now,next;
	step[n] = 0;
	vis[n]  = 1;
	q.push(n);
	while(!q.empty()){
		now = q.front();
		q.pop();
		for(int i = 0; i < 3; i++){
			if(i == 0) next = now-1;
			else if(i==1) next = now+1;
			else if(i==2) next = now*2;
			if(next < 0 || next > N) continue;
			if(!vis[next]){
				vis[next] = 1;
				q.push(next);
				step[next] = step[now]+1;
			}
			if(next == k) return step[next];
		}
	}
}

int main(){
	
	int n,k;
	while(cin >> n >> k){
		if(n >= k) cout << n-k << endl;
		else cout << bfs(n,k) << endl;
	}
	return 0;
}
