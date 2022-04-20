package com.library.tests;

import org.testng.Assert;

import java.util.*;

public class US1Practice {
    public static void main(String[] args) {
        List<Integer> actual=new ArrayList<>(Arrays.asList(1,2,2,3,4,5));
        System.out.println("actual = " + actual);
        Set<Integer> expected=new HashSet<>(actual);
        System.out.println("expected = " + expected);
        Assert.assertEquals(expected, actual);
    }
}
