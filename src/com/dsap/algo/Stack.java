package com.dsap.algo;

import java.util.Arrays;

public class Stack {

	private int arr[];
	private int top;
	private int capacity;

	// Creating a stack object
	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// to push into the stack
	public boolean push(int x) {
		if (isFull()) {
			return false;
		}
		arr[++top] = x;
		return true;
	}

	public int pop() {
		return (isEmpty()) ? -1 : arr[top--];
	}

	// To see the current stack size
	public int size() {
		return top + 1;
	}

	// To check the stack is full or not
	public boolean isFull() {
		return top == capacity - 1;
	}

//to check empty
	public boolean isEmpty() {
		return top == -1;
	}
	// to print stack

	public int[] stacks() {
		int totalStack[] = new int[top + 1];
		int j = 0;
		for (int i = 0; i <= top; i++) {
			totalStack[j++] = arr[i];
		}
		return totalStack;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(4);
		stack.push(5);
		System.err.println(stack.size());
		System.err.println(stack.pop());
		System.err.println(stack.pop());
		System.err.println(Arrays.toString(stack.stacks()));
	}

}
