package com.company;
import java.util.Scanner;

public class Main {

    public static String modifyNumber (String str) {
        StringBuffer strbuf = new StringBuffer();
        for (int i =0; i<str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                int num1 = str.charAt(i);
                int num2 = str.charAt(j);
                int num3 = num1 - num2;
                strbuf.append(Math.abs(num3));
            }
        }
        String st3= strbuf.toString();
        return str;
    }


    public static void main (String[] args) {
                Scanner sc= new Scanner (System.in);
                int num= sc.nextInt();
                String str =String.valueOf(num);
                String str1 =  modifyNumber(str);
                System.out.println(str1);
            }
}
