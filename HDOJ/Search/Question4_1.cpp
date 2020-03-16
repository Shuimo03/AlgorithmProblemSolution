#include<iostream>
#include<algorithm>
using namespace std;
//打印n个数的全排列 

int main(){
	
	int data[4] = {5,2,1,4};
	sort(data,data+4);
	do{
		
		for(int i = 0; i < 4; i++){
			cout << data[i] << " ";
		}
		cout << endl;
	}while(next_permutation(data,data+4));
	
	return 0;
}
