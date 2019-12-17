#include<iostream>
#include<cstdio>
#include<algorithm>
#include<cstring>
using namespace std;
char a[3];
int main(){

    while(cin >> a){
        sort(a,a+strlen(a));
        cout<<a[0]<<" "<<a[1]<<" "<<a[2]<<endl;
    }
    return 0;
}