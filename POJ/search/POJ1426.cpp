//http://poj.org/showmessage?message_id=355805
#include<cstdio>
using namespace std;
int n; bool suc; unsigned long long ans;
void DFS(unsigned long long now, int step){
	
	if(now % n == 0){
		ans = now;
		suc = true;
		return;
	}
	if(step == 19 || suc) return;
	DFS(now*10,step+1);
	DFS(now*10+1,step+1);
}

int main(){
	
	while(scanf("%d",&n),n){
		ans = suc = 0;
		DFS(1,1);
		printf("%llu\n",ans);
	}
	return 0;
}
