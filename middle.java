/* finding middle element of linked list and reversing a linked list 
                          
Given a singly linked list, find middle of the linked list. For example, if given linked list is 1->2->3->4->5 
then output should be 3. 

If there are even nodes, then there would be two middle nodes, we need to print second middle element. For example, 
if given linked list
is 1->2->3->4->5->6 then output should be 4
--------------------------------------------------------------------
                                
Given pointer to the head node of a linked list, the task is to reverse the linked list.

Input:
You need to complete a method reverse() that takes head as argument and returns new head.
There are multiple test cases. For each test case, this method will be called individually.  The first line of input contains number of test cases.  Every test case has two lines, number of nodes first line and data values in next line.

Output:
Reverse the linked list and return head of the modified list.


Example:
Input:
1
6
1 2 3 4 5 6

Output:
6 5 4 3 2 1




*/
import java.util.*;
import java.io.*;
 class node
{
 int data;

   node next;

   node(int d)
   {
    data=d;
    next=null;
   }


  
}

class linklist
{
    node first;
 
    linklist()
    {
        first=null;

    }
    boolean isempty()
    {
        return(first==null);
    }



void insert(int n)
{
    
    node ob=new node(n);
   
    ob.next=first;
    first=ob;
 


}

void find()
{
     node sp=first;
    node fp=first;
    while(fp.next!=null&&fp.next.next!=null)
    {
    fp=fp.next.next;
    sp=sp.next;
}
System.out.println("middle is "+sp.data);
}

void reverse()
{
    node current=first;
    node prev=null;node next =null;
    while(current!=null)
    {
        next=current.next;
        current.next=prev;
        prev=current;
        current=current.next;
    }

   first=prev;
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


}

class middle
{
    public static void main(String []args)
    {

    linklist oc=new linklist();

    Scanner in=new Scanner(System.in);
for(int i=0;i<6;i++)
{
   int k= in.nextInt();
   oc.insert(k);

}

oc.display();
oc.find();
oc.reverse();
oc.display();
    
}
}
