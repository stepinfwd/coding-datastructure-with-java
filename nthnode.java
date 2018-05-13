
//   question             
//Given a linked list, the task is to find the n'th node from the end.  
//  It is needed to complete a method that takes two argument, head of 
//  linked list and an integer n. There are multiple test cases. For each test case, this method will be called individually.
    
/*output


Input:
The first line of input contains number of test cases.  Every test case cntains two lines.  First line of every test case contains two space separated values, number of nodes  in linked list followed by value of n.  Second line of every test case contains data items of linked list.


Output:
Corresponding to each test case, output a single integer that is the nth integer in the linked list from the end. Print -1 if the value of n is greater than the number of elements in the linked list.

Constraints:
1 <= T <= 50
0 <= No of Nodes <= 1000
0 <= Data in Nodes <= 1000


Example:
Input:
2
9 2
1 2 3 4 5 6 7 8 9
4 5
10 -5 -100 5 
 

Output:
8
-1
*/

import java.io.*;
import java.util.*;

class node
{
    int data;
    node next;

    node(int x)
    {
        data=x;
        next=null;

    }
}

class linked
{
    node first;
    node mp,rp;

 

   int  find(int k)
    {
    rp=first;
    mp=first;
   while(k>=0)

  {
    mp=mp.next;
    k--;
  }   

 while(mp!=null)
    {
        mp=mp.next;
        rp=rp.next;
    }
    return (rp.data);

    }


    void insert(int d)
    {
     node oc=new node(d);
     oc.next=first;
     first=oc;
     
    }
}

class nthnode
{

    public static void main(String []args)
    {
        linked ob =new linked ();

        Scanner p=new Scanner(System.in);
        System.out.println("enter th no of nodes");
        int n=p.nextInt();
                System.out.println("enter the nodes");
        for(int i=0;i<n;i++)
        {
            int a=p.nextInt();
            ob.insert(a);
        }

       System.out.println( "enter node pos");
       int pos=p.nextInt();
          System.out.println("the node from "+pos +"position from end is");

       System.out.println( ob.find(pos));
    }
}
