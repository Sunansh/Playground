#include<iostream>
using namespace std;
int main()
{
int n,d1=0,d2=0,i,j;
  std::cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
    std::cin>>a[i][j];
    }
  }
 for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
    if(i==j)
      d1+=a[i][j];
   if(i+j+1==n)
     d2+=a[i][j];
    }
  }
  if(d1==d2)
    std::cout<<"Yes";
  else 
    std::cout<<"No";
}