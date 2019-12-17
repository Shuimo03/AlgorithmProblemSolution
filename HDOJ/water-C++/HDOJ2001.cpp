#include<iostream>
#include<cstdio>
#include<algorithm>
#include <cmath>
#include <iomanip>
using namespace std;


int main(){

    double x1,x2,y1,y2;
    cout << fixed << showpoint << setprecision(2) ;
    while(cin >> x1 >> y1 >> x2 >> y2){
        cout << sqrt(pow(x1-x2,2)+pow(y1-y2,2)) << endl;
    }
}