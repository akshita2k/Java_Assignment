package com.company;
import java.util.Scanner;

public class Main {

    public String getImage(String str)
    {
        StringBuffer strbuf1 = new StringBuffer(str);
        strbuf1.append('|');
        StringBuffer strbuf2 = new StringBuffer(str);
        strbuf2.reverse();
        strbuf1.append(strbuf2);
        return strbuf1.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Main m = new Main();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.print("The mirror image of " + str + " is : ");
        System.out.print(m.getImage(str));
    }
}


