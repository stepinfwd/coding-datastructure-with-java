
//java program to swap 2 given nodes

/*

Swap nodes in a linked list without swapping data
Given a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links. Swapping data of nodes may be expensive in many situations when data contains many fields.

It may be assumed that all keys in linked list are distinct.

Examples:

Input:  10->15->12->13->20->14,  x = 12, y = 20
Output: 10->15->20->13->12->14

Input:  10->15->12->13->20->14,  x = 10, y = 20
Output: 20->15->12->13->10->14

Input:  10->15->12->13->20->14,  x = 12, y = 13
Output: 10->15->13->12->20->14

*/
that is the nodes itself is swapped not data


import java.io.*;
import java.util.*;
class node
{
    int data;
    node next;

    node(int n)
    {
        data =n;
        next=null;
    }

}

class link
{
node first;
void insert(int y)
{
    node current=new node(y);
   
    current.next=first;
    first=current;

}



void fun(int x,int y)

{

    System.out.println("hp");
    node currentx=first,currenty=first,prevx=null,prevy=null;
    if(x==y)
    return;
    while(currentx.data!=x && currentx!=null)
    {
        prevx=currentx;
        currentx=currentx.next;
    }

while(currenty.data!=y && currenty!=null)
    {
        prevy=currenty;
        currenty=currenty.next;
    }

    if(currentx==null||currenty==null)
    return;
    if(prevx!=null)
    
        prevx.next=currenty;

     else
   first=currenty;
    if(prevy!=null)
  
        prevy.next=currentx;
  
    else
    first=currentx;
   node temp=currentx.next;

    currentx.next=currenty.next;
    currenty.next=temp;

    System.out.println("hi");
}
void display()
{
    node current=first;

    while(current!=null)
    {
        System.out.print(current.data+ "->");
        current=current.next;
    }
}


}
class linkelist
{
    public static void main(String [] args)
    {
       link ob=new link();
       Scanner s=new Scanner(System.in);
       
      System.out.println ("enter the no of nodes");
        int v=s.nextInt();

        for(int i=0;i<v;i++)
        {
       int k=s.nextInt();
       ob.insert(k);
    }
       ob.fun(2,5);
       ob.display();
    }
}

