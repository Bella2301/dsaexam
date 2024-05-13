

package labexam3;

import java.util.Stack;

public class third {
	int[] array;
	int topOfStack;
	
	public void createStack(int size) {
		topOfStack= -1;
		array= new int[size];
	}
public void push(int data) {
	if(array.length-1 == topOfStack) {
		System.out.println("overflow!");
	}else {
		array[topOfStack+1]= data;
		topOfStack++;
		System.out.println("Inserted!");
	}
}
public void pop() {
	if(topOfStack == -1) {
		System.out.println("Underbound!");
		
	}else {
		int temp= array[topOfStack];
		System.out.println(temp);
		topOfStack--;//removing top
	}
}
public void peek() {
	if (topOfStack == -1) {
		System.out.println("Stack is empty!");
	}else {
		int temp=array[topOfStack];
		System.out.println(temp);
	}
}
public boolean isEmpty() {
	if(topOfStack == -1) {
		return true;
	}else {
		return false;
	}
}
public boolean isFull() {
	if(array.length-1 == topOfStack) {
		return true;
	}else {
		return false;
	}
}
public void deleteStack() {
	array= null;
}

 public static void main(String [] args) {
	 third stack1 = new third();
	 third stack2 = new third();
	 
	 
	 stack1.createStack(4);
	 stack1.push(10);
	 stack1.push(20);
	 stack1.push(30);
	 stack1.push(888);
	// stack2.push(1);
	// stack2.push(2);
	System.out.println( stack1.isFull());
	
	
	
	//using imported
	
	Stack<Integer> stacka = new Stack<>();
	Stack<Integer> stackb = new Stack<> ();
	stacka.push(33);
	stacka.push(23);
	stackb.push(1);
	stackb.push(4);
	System.out.println(stacka.peek());
	System.out.println(stackb.peek());
	 
 }	 
	 
 }


/*Implement a linear queue data structure using two stacks in Java (take the 
Stacks in question 2), where the stacks are implemented using arrays. The 
implementation should provide functionality for enqueue, dequeue, and peek 
operations, adhering to the FIFO (First In, First Out) principle.*/





// 5. Implement a linear queue data structure using two stacks
MyQueue queue = new MyQueue();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
System.out.println("Dequeued element: " + queue.dequeue());
System.out.println("Peek element: " + queue.peek());

 