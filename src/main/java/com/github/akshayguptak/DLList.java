package com.github.akshayguptak;

public class DLList {
    
    private static class IntNode {
	public int item;
	public IntNode next;
	public IntNode prev;

	public IntNode(int i, IntNode n, IntNode p) {
	    item = i;
	    next = n;
	    prev = p;
	}
    }

    private IntNode sentinel;
    private int size;

    public DLList() {
	sentinel  = new IntNode(0, null, null);
	sentinel.next = sentinel;
	sentinel.prev = sentinel;
	size = 0;
    }

    public void addFirst(int x) {
	IntNode currentFirst = sentinel.next;
	sentinel.next  = new IntNode(x, currentFirst, sentinel);
	currentFirst.prev = sentinel.next;
	size += 1;
    }

    public int getFirst() {
	return sentinel.next.item;
    }

    public void removeFirst() {
	IntNode second = sentinel.next.next;
	sentinel.next = second;
	second.prev = sentinel;
    }

    public void addLast(int x) {
	IntNode currentLast = sentinel.prev;
	sentinel.prev = new IntNode(x, sentinel, currentLast);
	currentLast.next = sentinel.prev;
	size += 1;
    }

    public int getLast() {
	return sentinel.prev.item;
    }

    public void removeLast() {
	IntNode secondLast = sentinel.prev.prev;
	sentinel.prev = secondLast;
        secondLast.next = sentinel;
    }
    
}
