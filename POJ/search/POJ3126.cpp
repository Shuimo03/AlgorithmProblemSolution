//https://pipakacha.com/2019/07/poj3126-prime-pathbfs/
#include<iostream>
#include<cmath>
#include<queue>
using namespace std;

struct Node{
	int num,step;
}t,nt;

int prm[10000],cnt;
int vis[10000];
queue <Node>q;
bool isprime(int n){
	if(n == 1 || n == 0)return false;
	if(n == 2 || n == 3) return true;
	if(n % 6 != 1 && n %6 != 5) return false;
	int t = sqrt(n);
	for(int i = 5; i <= t; i++){
		if(n%i == 0 || n %(i+2) == 0){
			return false;
		}
	}
	return true;
}

void init(){
	
	cnt = 0;
	for(int i = 1000; i < 10000; i++){
		if(isprime(i)){
			prm[cnt++] = i;
		}
	}
}

bool judge(int num1, int num2){
	if(vis[num2]) return false;
	int cntt = 0;
	while(num1 && num2){
		if(num1 %10 == num2 %10){
			cntt++;
		}
		num1 /= 10;
		num2 /= 10;
	}
	if(cntt == 3){
		return true;
	}
	else{
		return false;
	}
}

int BFS(int a, int b){
	if(a == b) return 0;
	t.num = a;
	t.step = 0;
	q.push(t);
	while(!q.empty()){
		t = q.front();
		q.pop();
		for(int i = 0; i < cnt; i++){
			nt.num = prm[i];
			nt.step = t.step+1;
			if(judge(t.num,nt.num)){
				if(nt.num == b){
					return nt.step;
				}
				q.push(nt);
				vis[nt.num] = 1;
			}
		}
	}
	return -1;
}

void clean(){
	for(int i = 1000; i < 10000; i++){
		vis[i] = 0;
		while(!q.empty()){
			q.pop();
		}
	}
}

int main(){
	init();
	int T,a,b;
	cin >> T;
	while(T--){
		
		clean();
		cin >> a >> b;
		int ans = BFS(a,b);
		if(ans == -1){
			cout << "Impossible"<<endl;
		}
		else{
			cout << ans << endl;
		}
	}
	return 0;
}
