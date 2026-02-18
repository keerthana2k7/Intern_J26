#include<stdio.h>
int main() {
    /*write string compression use hashmap
    1.aaabbc -> a3b2c1*/
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);
     int hashTable[256]={0};
     for(int i=0; str[i]!='\0'; i++) {
        hashTable[str[i]]++;
     }
        for(int i=0; i<256; i++) {
            if(hashTable[i]>0) {
                printf("%c%d", i, hashTable[i]);
            }
        }
    }