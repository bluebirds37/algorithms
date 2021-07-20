package com.blue.base.load;



public class StringTest {

    public static void main(String[] args) {

        String a = "abcd";
        String aIntern = a.intern();

        StringBuilder b = new StringBuilder("abcd");
        System.out.println(a==aIntern);

        System.out.println("================");
        System.out.println(aIntern==b.toString());

    }

}
