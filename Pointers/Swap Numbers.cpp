#include<iostream>
using namespace std;
int main(){
    int a,b;cin>>a>>b;
    int *ptr1=&a;
    int *ptr2=&b;
    int temp=0;
    temp=*ptr1;
    *ptr1=*ptr2;
    *ptr2=temp;
    cout<<*ptr1<<" "<<*ptr2;
    
    
}