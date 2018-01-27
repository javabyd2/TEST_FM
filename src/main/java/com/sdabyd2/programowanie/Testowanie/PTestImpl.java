package com.sdabyd2.programowanie.Testowanie;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class PTestImpl {

    public static void main(String[] args) {

    }

    public static String last(List<String> lista) {
        return lista.get(lista.size() - 1);
    }

    public static Integer howLong(List<Integer> lista) {
        return lista.size();
    }


    public static List<Integer> reverse(List<Integer> numbers) {

        Collections.reverse(numbers);

     /* for (int i = toReverse.size()-1; i >= 0 ; i--) {

        System.out.println(reversed.add(toReverse.size()-i));
      }*/

        return numbers;
    }

    public static boolean isPalindrome(List<String> characters) {

        List<String> reversedChars = new ArrayList<String>();
        for (int i = characters.size() - 1; i >= 0; i--) {
            reversedChars.add(characters.get(characters.size() - 1 - i));
        }

        boolean isPalindrome = reversedChars.equals(characters);
        System.out.println(isPalindrome);
        return isPalindrome;
    }


//    public static Object[] removeElement(List<String> list){
//
//
//
//
//    }

    public static List<String> randomSelect(List<String> list, int howMany) {


        List<String> shortList = new ArrayList<String>();
        Random random = new Random(System.currentTimeMillis());
        int randomPosition;

        for (int j = 0; j < howMany; j++) {
            randomPosition = random.nextInt(list.size());
            shortList.add(list.get(randomPosition));
            list.remove(randomPosition);
        }
        return shortList;
    }
}