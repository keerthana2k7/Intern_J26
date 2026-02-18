#include<stdio.h>
#include<stdlib.h>

#define TABLE_SIZE 100
/*
//create a hashtable structure
struct Node {
    int key;
    int value;
};

typedef struct Node Node;

Node* hashTable[TABLE_SIZE];

// create a hashing value function

int hash(int key) {
    if(key<0) {
        key=-key;   
    }
    return key % TABLE_SIZE;
}


void insert(int key, int value) {
    int index = hash(key);
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->key = key;
    newNode->value = value;
    hashTable[index] = newNode;
}

int search(int key) {
    int index = hash(key);
    Node* temp = hashTable[index];
   if (temp!=NULL) {
   // if(temp->key==key) {
        return temp->value;
   // }
}
    return -1;
}

int main() {
    insert(1, 10);
    insert(2, 20);
    printf("Value for key 1: %d\n", search(1));
}*/
// using integer array using hash map

int hashTable[TABLE_SIZE];
void insert(int key, int value) {
   hashTable[key] = value;
}

int search(int key) {
    if(hashTable[key]!=0) {
        return hashTable[key];
    }
    return -1;
}
int main() {
    int arr[] = {12, 7, 2, 15};
    int target = 9;
    for(int i=0; i<4; i++) {
        insert(arr[i], i);
    }
    for(int i=0; i<4; i++) {
        int complement = 9 - arr[i];
        int index = search(complement);
        if(index!=-1) {
            printf("Indices: %d, %d\n", i, index);
            break;
        }
    }
}