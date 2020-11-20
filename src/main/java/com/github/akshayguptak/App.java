package com.github.akshayguptak;

public class App 
{
    public static void main( String[] args )
    {
        DLList L = new DLList();
	L.removeFirst();
	L.removeLast();
	L.addLast(5);
	L.removeFirst();
	L.addFirst(6);
	System.out.print(L.getFirst());
    }
}
