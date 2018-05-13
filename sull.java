//implementing stack using linkedlsit 
import java.util.*;
import java.io.*;
class node
{
    int data;
    node next;

    node(int val)
    {
        data=val;
        next=null;
    }
}

class  linkedlist
{
    node first;

    void push(int n)
    {
        node ob=new  node(n);
       
        ob.next=first;
        first=ob;
    }
    void pop()
    {
        first=first.next;
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
class sull
{
    public static void main(String []args)
    {
        linkedlist ob =new linkedlist();
        Scanner oc=new Scanner(System.in);
        int x=0;
         while(x!=4)
        {
        System.out.print("enter the operation");
        int c=oc.nextInt();
       
        switch(c)
        {

            case 1:
                System.out.print("enter the number to insert");
                int p=oc.nextInt();
                ob.push(p);
                break;

                case 2:
                ob.pop();
                break;

                case 3:
                ob.display();
                break;

                case 4:
                System.exit(0);
                break;
        }
        }

    }
}



   