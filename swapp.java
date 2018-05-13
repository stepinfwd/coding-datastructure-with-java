
//java program to swap 2 given nodes with its value


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
void swappy()
{
    node ref,after;
    int temp=0;
    after=null;
    ref=first;
   while(ref!=null&& ref.next!=null)
   {
       after=ref.next;
       temp=ref.data;
       ref.data=after.data;
       after.data=temp;
       ref=after.next;
   }
}
void display()
{
    node current=first;

    while(current!=null)
    {
        System.out.print(current.data+ "->");
        current=current.next;
    }
     System.out.print("\n");
}
}




class swapp
{
    public static void main(String [] args)
    {
       link ob=new link();
       Scanner s=new Scanner(System.in);
       
      System.out.println ("enter the no of nodes");
        int v=s.nextInt();
          System.out.println ("enter the nodes");

        for(int i=0;i<v;i++)
        {
       int k=s.nextInt();
       ob.insert(k);
    }
       ob.display();
       ob.swappy();
          ob.display();
    
    }
}

