#include<iostream>
using namespace std;
int main()
{
  int n,x=1,y=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  std::cout<<x;
  for(int i=1;i<n;i++)
  {
    if(a[i]<a[i-1])
      std::cout<<"\n"<<x;
    else
    {
      y+=2;
      std::cout<<"\n"<<y;
    }
  }
}  