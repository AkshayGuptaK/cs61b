package com.github.akshayguptak;

public class SLList<T> {
    
    private class Node {
	public T  item;
	public Node next;

	public Node(T i, Node n) {
	    item = i;
	    next = n;
	}
    }

    private Node sentinel;
    private int size;

    public SLList() {
	sentinel  = new Node(null, null);
	size = 0;
    }

    public void addFirst(T x) {
	sentinel.next  = new Node(x, sentinel.next);
	size += 1;
    }

    public T getFirst() {
	return sentinel.next.item;
    }

    public void addLast(T x) {
	size += 1;

	Node p = sentinel;

	while (p.next != null) {
	    p = p.next;
	}

	p.next = new Node(x, null);
    }
    
}
