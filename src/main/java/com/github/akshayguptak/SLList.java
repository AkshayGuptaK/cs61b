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

    private IntNode first;
    private int size;

    public void SLList() {
	first = null;
	size = 0;
    }

    public void SLList(int x) {
	first = new IntNode(x, null);
	size = 1;
    }

    public void addFirst(int x) {
	first  = new IntNode(x, first);
	size += 1;
    }

    public int getFirst() {
	return first.item;
    }

    public void addLast(int x) {
	size += 1;

	if (first == null) {
	    first = new IntNode(x, null);
	    return;
	}
	
	IntNode p = first;

	while (p != null) {
	    p = p.next;
	}

	p = new IntNode(x, null);
    }
    
}
