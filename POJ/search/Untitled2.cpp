#include<cstdio>
#include<cstring>
#include<algorithm>
#include<map>
#include<queue>
#define ll long long
using namespace std;

struct poi{
	int x,y;
}a[5],b[5];

struct op{
	ll ma,t;
};

ll st,en;
map<ll,int>p;
bool bfs(int t, int f, ll r){
	queue<op> q;
	op,v,u;
	v.ma = r;
	v.t = 0;
	if(p[r] == t) return 1;
	p[r] = f;
	while(!q.empty())q.pop();
	q.push(v);
	while(!q.empty()){
		v = q.front();
	}
}
