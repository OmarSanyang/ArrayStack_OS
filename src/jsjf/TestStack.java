package jsjf;

import jsjf.exceptions.EmptyCollectionException;
/**
 * project 4
 * @author omarsanyang
 * test the ArrayStack
 * 
 * 04/2020
 */

public class TestStack {

	public static void main(String[] args) {
		
		ArrayStack DEFAULT = new ArrayStack();
		System.out.println(DEFAULT.isEmpty());
		System.out.println(DEFAULT.toString());
		
		try {
			DEFAULT.pop();
		}
		catch(EmptyCollectionException e) {
			System.out.println("it can not do the operation while the stack is empty");
		}

		ArrayStack<Object> stack = new ArrayStack<Object>(4);
		
		Object element = new Object();
		Object element1 = new Object();
		Object element2 = new Object();
		Object element3 = new Object();
		Object element4 = new Object();
		
		System.out.println(stack.isEmpty());
		
		stack.push(element);
		stack.push(element1);
		stack.push(element2);
		stack.push(element3);
		stack.push(element4);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.toString());
		
		System.out.println("\n" + stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		
		try {
			System.out.println(stack.peek());
		}
		catch(EmptyCollectionException e) {
			System.out.println("it can not do the peek operation while the stack is empty");
		}
		
		try {
			System.out.println(stack.pop());
		}
		catch(EmptyCollectionException e) {
			System.out.println("it can not do the pop operation while the stack is empty");
		}
		
	}// end of main class

}
