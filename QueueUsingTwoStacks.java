package epam_week4;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueueUsingTwoStacks {
    static Stack<Integer> s1 = new Stack<Integer>();  
    static Stack<Integer> s2 = new Stack<Integer>();  
     static void enqueue(int x)  
    {   
        s1.push(x);
    }
    static void dequeue()  
    {   
        if (s2.isEmpty()) { 
            while (!s1.isEmpty()) { 
                s2.push(s1.pop()); 
            } 
        } 
        s2.pop();     
    }  
    static void print(){
        if (s2.isEmpty()) { 
            while (!s1.isEmpty()) { 
                s2.push(s1.pop()); 
            } 
        } 
        System.out.println(s2.peek());
    }  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int q,i,type,num;
        Scanner sc=new Scanner(System.in);
        q=sc.nextInt();
        for(i=0;i<q;i++){
            type=sc.nextInt();
            if(type==1){
              num=sc.nextInt();
              enqueue(num);
            }
            else if(type==2)
                 dequeue();
                else 
                print();
        }
    }
}

