package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s=Integer.toString(number);
        int sum=0;
        char [] array=s.toCharArray();
        for (int i=0;i<array.length;i++){
            sum+=Character.digit(array[i],10);
        }
        return sum;
        //напишите тут ваш код
    }
}