package labexam2;

import java.util.Stack;

public class second {
  int[] array;
  int topOfStack;


 public void createStack(int size) {
   array = new int[size];
   topOfStack= -1;
   
 }
 
 public void push(int data) {
   if(array.length-1==topOfStack) {
     System.out.println("Overflow!");
     return;
   }else {
     array[topOfStack + 1]= data;
     topOfStack ++;
     System.out.println("Inserted");
   } 
   }
   public void pop() {
     if (topOfStack== -1) {
       System.out.println("Underbound!");
     }else {
       
       int temp= array[topOfStack];
       topOfStack--;
       System.out.println(temp);
       }
   
 }
   
 

public static void main(String [] args) {
  
  second stack = new second();
  
  stack.createStack(4);
  stack.push(20);
  stack.push(30);
  stack.push(40);
  stack.push(888);
  stack.pop();
  
  
  //from java.util
  
  Stack<Integer> stacks = new Stack<>();
  stacks.push(10);
  stacks.push(20);
  stacks.push(30);
  System.out.println("top: " + stacks.peek());
  stacks.pop();
  System.out.println("second: " + stacks.peek());
  
  
  
}
}
