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