package com.dsap.data.type;

public class DataType {

//	I. Quick Summary: The Hierarchy
//	In Java, data types are divided into two main categories:
//
//	Primitive Data Types (8 Types): Stored directly in the Stack memory. They hold the actual value.
//
//	Numeric (Integer): byte (8-bit), short (16-bit), int (32-bit), long (64-bit).
//
//	Numeric (Floating Point): float (32-bit), double (64-bit).
//
//	Character: char (16-bit Unicode).
//
//	Boolean: boolean (true/false).
//
//	Reference Data Types (Non-Primitive): Stored in the Heap memory. The variable in the stack holds the address (reference) to the object in the heap.
//
//	Examples: String, Arrays, Classes, Interfaces.

	public static void main(String[] args) {
		Integer a = 127;
		Integer b = 127;

		System.out.println(a == b);
	}
}
