#include <bits/stdc++.h> 
using namespace std;

int main() {
	
	int t,n,temp;
	cin>>t;
	while(t--){
		
		string str,str1;
		stack<int> s;
		queue<int> q;
		cin >> n >> str;
		for(int i = 0; i < n; i++){
			if(str == "FIFO"){ //╤сап 
				cin >> str1;
				if(str1 == "IN"){
					cin >> temp;
					q.push(temp);
				}
				if(str1 =="OUT"){
					if(q.empty()){
						cout << "None" << endl;
					}
					else{
						cout << q.front()<< endl;
						q.pop();
					}
				}
			}
			
			if (str == "FILO"){
				cin >> str1;
				if(str1 == "IN"){
					cin >> temp;
					s.push(temp);
				}
				if(str1 == "OUT"){
					if(s.empty()){
						cout << "None" << endl;
					}
					else{
						cout << s.top() << endl;
						s.pop();
					}
				}
			}
		}
	}
	
	return 0;
}
