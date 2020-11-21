package com.github.akshayguptak;

public class DLList<T> {
    
    private class Node {
	public T item;
	public Node next;
	public Node prev;

	public Node(T i, Node n, Node p) {
	    item = i;
	    next = n;
	    prev = p;
	}
    }

    private Node sentinel;
    private int size;

    public DLList() {
	sentinel  = new Node(null, null, null);
	sentinel.next = sentinel;
	sentinel.prev = sentinel;
	size = 0;
    }

    public void addFirst(T x) {
	Node currentFirst = sentinel.next;
	sentinel.next  = new Node(x, currentFirst, sentinel);
	currentFirst.prev = sentinel.next;
	size += 1;
    }

    public T getFirst() {
	return sentinel.next.item;
    }

    public void removeFirst() {
	Node second = sentinel.next.next;
	sentinel.next = second;
	second.prev = sentinel;
    }

    public void addLast(T x) {
	Node currentLast = sentinel.prev;
	sentinel.prev = new Node(x, sentinel, currentLast);
	currentLast.next = sentinel.prev;
	size += 1;
    }

    public T getLast() {
	return sentinel.prev.item;
    }

    public void removeLast() {
	Node secondLast = sentinel.prev.prev;
	sentinel.prev = secondLast;
        secondLast.next = sentinel;
    }
    
}
