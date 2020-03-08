package com.nt.proj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StringJava {
 static String s="Javanet";
public static void main(String[] args) {
		
char a []=s.toCharArray();
 List<char[]> l=Arrays.asList(a);
 System.out.println(l.get(0));
 
 HashSet s= new HashSet(l);

	

}
}
