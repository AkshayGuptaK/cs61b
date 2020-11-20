package com.github.akshayguptak;

public class SLList {
    
    private static class IntNode {
	public int item;
	public IntNode next;

	public IntNode(int i, IntNode n) {
	    item = i;
	    next = n;
	}
    }

    private IntNode sentinel;
    private int size;

    public SLList() {
	sentinel  = new IntNode(0, null);
	size = 0;
    }

    public void addFirst(int x) {
	sentinel.next  = new IntNode(x, sentinel.next);
	size += 1;
    }

    public int getFirst() {
	return sentinel.next.item;
    }

    public void addLast(int x) {
	size += 1;

	IntNode p = sentinel;

	while (p.next != null) {
	    p = p.next;
	}

	p.next = new IntNode(x, null);
    }
    
}
