package com.atguihu.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zzq
 * @create 2020/1/22 - 23:17
 */
public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println("hello");

//        soutp
        System.out.println("args = " + Arrays.deepToString(args));

//        soutm
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        int num2 = 20;
//        soutv
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
//        fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        iter
        for (String s : arr) {
            System.out.println(s);
            System.out.println("s = " + s);
        }

//        itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(345);

        for (Object o : list) {

        }


        for (int i = 0; i < list.size(); i++) {

        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {

        }

        if (list != null) {

        }


        
    }


    public void method() {
        System.out.println("TemplatesTest.method");
    }
}
