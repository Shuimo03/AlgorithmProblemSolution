#include<iostream>
#include<vector>
#include<queue>
using namespace std;
typedef pair<int,int>P;
queue<P> q;
vector<P> path;
const char* oprate[] = {"FILL(1)","FILL(2)","DROP(1)","DROP(2)","POUR(1,2)","POUR(2,1)"};
int used[1000][1000] = {0};
int a,b,c;
int i = -1;
void print(int p,int s){
	if(p == 0){
		cout << s << endl;
		return;
	}
	print(path[p].second,s+1);
	cout <<oprate[path[p].first]<<endl;
}

void bfs(){
	P p(0,0);
	q.push(p);
	path.push_back(P(0,0));
	bool flag = false;
	while(!q.empty()){
		P cur = q.front();
		i++;
		if(cur.first == c || cur.second == c){
			flag = true;
			break;	
		}
		if(!used[cur.first][cur.second]){
				used[cur.first][cur.second] = 1;
			q.push(P(a, cur.second));
			path.push_back(P(0, i));

			q.push(P(cur.first, b));
			path.push_back(P(1, i));

			q.push(P(0, cur.second));
			path.push_back(P(2, i));

			q.push(P(cur.first, 0));
			path.push_back(P(3, i));

			q.push(P(max(cur.first - b + cur.second, 0), min(b, cur.second + cur.first)));
			path.push_back(P(4, i));

			q.push(P(min(a, cur.first + cur.second), max(cur.second - a + cur.first, 0)));
			path.push_back(P(5, i));
		}
	}
	if(flag){
		print(i,0);
	}
	else{
		cout << "impossible"<<endl;
	}
}

int main(){
	cin >> a >> b >> c;
	bfs();
	return 0;
}
