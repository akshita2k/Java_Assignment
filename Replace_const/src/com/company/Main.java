package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = s.next();
        System.out.println("The original string is : " + str);
        System.out.print("The altered string is : ");
        System.out.println(m.alterString(str));
    }

    public String alterString(String str) {
        StringBuffer strbuf = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            char c = strbuf.charAt(i);
            if (!(c == 'A' || c == 'a' || c == 'E' || c == 'e'|| c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u' )) {
                strbuf.replace(i, i + 1, String.valueOf((char) (c + 1)));
            }
        }
        return strbuf.toString();
    }
}