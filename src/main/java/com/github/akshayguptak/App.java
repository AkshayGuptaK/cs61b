package com.github.akshayguptak;

public class App 
{
    public static void main( String[] args )
    {
        SLList<String> L = new SLList<>();
	L.addLast("a");
	L.addLast("b");
	L.addLast("c");
	L.addLast("d");
	L.reverse();
	L.print();
    }
}
