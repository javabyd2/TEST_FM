package com.sdabyd2.programowanie.Testowanie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listaDluga = new ArrayList<String>();

        listaDluga.add("a");
        listaDluga.add("b");
        listaDluga.add("c");
        listaDluga.add("d");
        listaDluga.add("e");
        listaDluga.add("f");
        listaDluga.add("g");

        List<String> listakrotka = PTestImpl.randomSelect(listaDluga, 3);

        System.out.println(listakrotka);
        System.out.println(listaDluga);

    }
}
