#include<iostream>
#include<iomanip>
using namespace std;

int main(){
    double input;
    while(cin >> input){
        double result = ABS(input);
         cout<<setprecision(2)<<result<<endl;
    }
}

double ABS(double a){
    return (a < 0) ? -a:a;
}