package com.java.demo;
import java.util.StringTokenizer;
public class StrTokenizer {
    public static void main(String[] args) {

    	StringTokenizer s = new StringTokenizer("i love nature");
    	while(s.hasMoreTokens()) {
    		System.out.println(s.nextToken());
    	}
	}
}
