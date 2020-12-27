package com.queueexample.com;

public interface Queue {

	public int size();
	public boolean isEmpty();
	public void enque(Object o);
	public Object deque();
	public Object front();
}
