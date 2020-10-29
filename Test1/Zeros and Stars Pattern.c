#include<stdio.h>
int main()
{

 int num,n,r,c;
 scanf("%d", &num);
 n=num;
 for(r=1; r<=num; r++,n--)
 {
   for(c=1; c<r; c++)
      printf("0");
   for(c=1; c<=n; c++)
   {
      if(c==1)
         printf("*");
      else
         printf("0");
   }
   printf("*");
   for(c=1; c<n; c++)
      printf("0");
   for(c=1; c<=r; c++)
   {
      if(c==1)
         printf("*");
      else
         printf("0");
   }
   printf("\n");
 }
 return 0;
}
