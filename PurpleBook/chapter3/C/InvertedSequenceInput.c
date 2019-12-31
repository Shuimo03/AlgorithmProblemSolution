/**
 * 读入一些整数,逆序输出到一行,整数不超过100,例如输入 1 2 3 4 5, 输出5 4 3 2 1
 * */

#include <stdio.h>
#define maxn 105 //数组最大长度
int arr[maxn];

int main(){

    int x,n = 0;
    while(scanf("%d",&x) == 1){
        arr[n++] = x;

        for(int i = n-1; i >= 1; i--){
            printf("%d ",arr[i]);
        }
        printf("%d\n",arr[0]);
    }
    return 0;
}