#include<iostream>
#include<iomanip>
#include<cmath>
#include<algorithm>
#define PI 3.1415927
using namespace std;
int main(){

    double a,s;
    cout << setiosflags(ios::fixed);
    while(cin >> a){
        s = pow(a,3) * (4/3.0)*PI;
        cout<<setprecision(3)<<s<<endl;
    }
    return 0;
}