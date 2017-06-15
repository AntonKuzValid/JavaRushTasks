package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        for (int i=0;i<10;i++){
            list.add(s.nextLine());
        }
        String l=findLong(list);
        String sh=findShort(list);
        if (list.indexOf(l)<list.indexOf(sh)) System.out.println(l);
        else System.out.println(sh);
        //напишите тут ваш код
    }
    public static String findLong(ArrayList<String> list)
    {
        int length=list.get(0).length();
        String l=list.get(0);
        for (String s:list)
        {
            if (s.length()>length) {
                length = s.length();
                l = s;
            }
        }
        return l;
    }
    public static String findShort(ArrayList<String> list)
    {
        int length=list.get(0).length();
        String l=list.get(0);
        for (String s:list)
        {
            if (s.length()<length) {
                length = s.length();
                l = s;
            }
        }
        return l;
    }
}
