/*
            
Given a singly linked list of integers, Your task is to complete the function isPalindrome that returns true if the given list is palindrome, else returns false.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T testcases follow. Each test case contains 2 line the first line of each test case contains an integer N denoting the size of the linked list. The next line contains N space separated integers denoting the values of the nodes of the linked list.

Output:
For each test case output will be 1 if the linked list is a palindrome else 0.

Constraints:
1<=T<=1000
1<=N<=50

Example(To be used only for expected output):
Input
2
3
1 2 1
4
1 2 3 4

Output:
1
0


*/


import java.util.*;
import java.io.*;
class node
{
    node next;
    int data;
    

  node (int x)
    {
        data=x;
        next=null;
    }
}

class linkedlist
{
 node first;
     node fp,sp,mid,sprev;

void middle(node f)
{
    sp=f;
    fp=f;
    while(fp!=null&&fp.next!=null)
     {
        sprev=sp;
    sp=sp.next;
    fp=fp.next.next;

    }
    if(fp!=null)
    {
 mid=sp;
 sp=sp.next;
    }
    sprev.next=null;

   



}

void insert(int n)
{
    
    node oc=new node(n);
   
    oc.next=first;
    first=oc;
 


}
 void display()
   {
       node current=first;

       while(current!=null)
 {
       System.out.print(current.data+"->");

   current=current.next;

}
     
   }
   void dip()
   {
       System.out.println(sprev.data +"\t"+ sp.data);
   }

boolean reverse(node head2)
{
node prev=null;
node current=head2;
node ne=null;

while(current!=null)
{
    ne=current.next;
    current.next=prev;
    prev=current;
    current=ne;
}
head2=prev;
if(compare(first,head2)==true)
return true;
else 
return false;

  

}
boolean compare(node f1,node f2)
{
    while(f1.next!=null&& f2.next!=null)
    {
        if(f1.data==f2.data)
        {
            f1=f1.next;
           f2= f2.next;
        }
        else
        return false;

    }
    return true;

}


}

class palindrome
{
    public static void main(String [] args)
    {

        linkedlist ob =new linkedlist();

    Scanner in=new Scanner(System.in);
for(int i=0;i<5;i++)
{
   int k= in.nextInt();
   ob.insert(k);

}
ob.display();
      ob.middle(ob.first);
     if( ob.reverse(ob.sp)==true)
       System.out.println("pal");
       else 
              System.out.println("its not pal");
               ob.dip();
    }
   

}
