package com.github.akshayguptak;

public class App 
{
    public static void main( String[] args )
    {
        AList<String> L = new AList<>();
	L.addLast("a");
	L.removeLast();
	L.addLast("capacity");
	System.out.print(L.getLast());
    }
}
