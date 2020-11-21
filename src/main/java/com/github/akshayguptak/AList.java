package com.github.akshayguptak;

public class AList<Item> {
    private Item[] items;
    private int size;

    private static final int rFactor = 2;
    private static final double usageRatio = 0.25;

    public AList() {
	items = (Item[]) new Object[100];
	size = 0;
    }

    public void resize(int capacity) {
       Item[] arr = (Item[]) new Object[capacity];
       System.arraycopy(items, 0, arr, 0, size);
       items = arr;
    }

    public void addLast(Item x) {
	if (size == items.length) {
	    resize(size * rFactor);
	}
	items[size] = x;
	size += 1;
    }

    public Item removeLast() {
	Item last  = getLast();
	size -= 1;

	if (size / items.length < usageRatio) {
	    resize(items.length / rFactor);
	}
	return last;
    }

    public Item getLast() {
	return items[size - 1];
    }

    public Item get(int i) {
	return items[i];
    }

    public int size() {
	return size;
    }
}
