package org.example;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> l;
        //Different choices to implement list
        l = new ArrayList<>();
        // l = new CopyOnWriteArrayList<>();
        // l = new LinkedList<>();
        // l = new Vector<>();
        // l = new Stack<>();
        l.add("a");
        l.add("b");
        System.out.println(l.get(0));               //print a
        System.out.println(l.get(1));               //print b
        System.out.println(l.size());               //print 2
        l.set(1,"c");
        System.out.println(l.get(1));               //print c
        ListIterator<String> li = l.listIterator();
        while (li.hasNext())                        //Print all members of l
            System.out.println(li.next());
        l.clear();                                  //empty l
    }
}