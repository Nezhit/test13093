package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int x=123456;

        char[] s=Integer.toString(x).toCharArray();
        char[] s2=new char[s.length];

        for(int i =0;i<s.length;i++){

            s2[i]=s[s.length-i-1];
        }
        System.out.println(s2);
    }
}