package com.stackexample.com;

public class ArrayBasedStack implements Stack {

	
	private static final int CAPACITY = 1024;
	private int N;
	private Object S[];
	private int t=-1;
		
	public ArrayBasedStack() {
		this(CAPACITY);
	}
	
	public ArrayBasedStack(int cap) {
		
		N = cap;
		S = new Object[N];
	}

	public int size() {
		return t+1;
	}
	
	public boolean isEmpty() {
		return (t<0);
	}
	
	public Object top() {
		if (isEmpty())
			return null;
		return S[t];
	}

	public Object push(Object elemennt) {
		if(size()==N) {
			System.out.println("Stack full");
			return null;
		}
		return S[++t] = elemennt;			
	}
	
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Array empty");
			return null;
		}
			
		Object o= S[t];
		S[t--] = null;
		return o;
	}

	@Override
	public Object printAll() {
		
		return S;
	}

}
