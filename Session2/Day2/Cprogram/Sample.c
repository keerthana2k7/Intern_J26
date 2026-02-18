#include<stdio.h> 
// int main() 
// { 
  /*1)  //sum of n natural numbers
    int x;
    printf("Enter a number: ");
    scanf("%d", &x);
    //int sum=0;
    // for(int i=1; i<=x; i++)
    // {
    //     sum+=i;
    // }
    int sum = (x * (x + 1)) / 2;
    //long long sum = (long long)x * (x + 1) / 2;


    printf("The sum is: %d", sum);  
    */


  /* 2)  //prime numbers
    int n, i, flag = 0;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    if (n == 0 || n == 1) {
        printf("%d is not a prime number.", n);
    }
    else {
        // for(int i = 2; i <= n / 2; i++) {
        //     if (n % i == 0) {
        //         flag = 1;
        //         break;
        //     }
        //for (int i=2;i*i<=n;i++)
        for(int i=2;i*i<=n;i++)
        {
            if (n % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            printf("%d is a prime number.", n);
        else
            printf("%d is not a prime number.", n);
    }
    */



    //Fibanacci series
    // int n, t1 = 0, t2 = 1, nextTerm;
    // printf("Enter the number of terms: ");
    // scanf("%d", &n);
    // printf("Fibonacci Series: ");
    // for (int i = 1; i <= n; ++i) {
    //     printf("%d, ", t1);
    //     nextTerm = t1 + t2;
    //     t1 = t2;
    //     t2 = nextTerm;
    // }
    // printf("\n");
   /* int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }*/
    // printf("Enter the number of terms: ");
    // int n;      
    // scanf("%d", &n);
    // printf("Fibonacci Series: ");
    // for (int i = 0; i < n; i++) {
    //     printf("%d, ", fibonacci(i));
    // }
    // printf("\n");
    int main() {
        /*int n=5;
        int arr[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<=n;i++) 
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        printf("%d",arr[n-1]);*/


        int n=10;//contant time
        for(int i=0;i<=n;i++)//n time
        {
            for(int j=0;j<=n;j+=2)//n times
        {
            printf("%d ",i+j);//n*n times
        }
        printf("\n");
        //conatant time + 
        //c1+(n*n*c2)
        //c1+(n^2*c2)
        //O(n^2)
    }
