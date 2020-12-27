package com.queueexample.com;

public class ArrayBasedQueue implements Queue {

	private static final int CAPACITY = 10;
	private int N;
	private Object S[];
	private int f = -1;
	private int r = 0;


	public ArrayBasedQueue() {

		this(CAPACITY);
	}

	ArrayBasedQueue(int cap) {
		N = cap;
		S = new Object[N];
	}

	@Override
	public int size() {

		return (N - f + r) % N;
	}

	@Override
	public boolean isEmpty() {

		return (f == r || f == -1);
	}

	@Override
	public void enque(Object o) {
		if (size() == N-1)
			System.out.println("Queue is Full");
		else {
			if(f==-1)
				f=0;
			S[r] = o;
			r = (r + 1) % N;
		}
	}

	@Override
	public Object deque() {

		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		} else {
			Object s = S[f];
			S[f] = null;
			f = (f + 1) % N;
			return s;
		}
	}

	@Override
	public Object front() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		return S[f];
	}

	public void displayAll() {
		for (Object obj : S) {
			System.out.println((String) obj);
		}
	}

}
