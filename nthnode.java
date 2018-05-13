

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