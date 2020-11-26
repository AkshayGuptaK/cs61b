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

    public void print() {
	Node p = sentinel.next;

	System.out.print("[ ");

	while (p != null) {
	    System.out.print(p.item);
	    System.out.print(" ");
	    p = p.next;
	}

	System.out.print("]");
    }

    public void insert(T x, int position) {
	size += 1;

	Node p = sentinel;

	while (p.next != null && position > 0) {
	    p = p.next;
	    position -= 1;
	}

	p.next = new Node(x, p.next);
    }

    public void reverse() {
	if (sentinel.next != null) {
	    reverseHelper(sentinel.next).next = null;
	}
    }

    private Node reverseHelper(Node p) {
	if (p.next == null) {
	    sentinel.next = p;
	    return p;
	}
	reverseHelper(p.next).next = p;
	return p;
    }
}
