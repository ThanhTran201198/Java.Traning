package fis.topic03.exercise02;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String s="a b c";
		String[] x=s.split(" ");
		int a = x.length;
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
}
