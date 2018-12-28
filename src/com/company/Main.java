package com.company;

// get interleaved strings print out throw recursion
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String res = "";
        String p = "xy";
        String q = "wz";

        Set<String> out= new HashSet<>();

        System.out.println("The originialString is : "+ p + "  "+ q +"  " );
        System.out.println("The interleavings are: ");
        interleavings(res,p,q,out);

        out.stream().forEach(System.out :: println);


    }



    public  static void interleavings(String res,String p, String q, Set<String> out){

        if(p.length()==0 && q.length()==0) {
            out.add(res);
            return;
        }
        if(p.length() > 0) {
            interleavings(res+p.charAt(0) , p.substring(1), q, out);
        }
        if(q.length() > 0) {
            interleavings(res +q.charAt(0), p , q.substring(1),  out);
        }



    }
}
