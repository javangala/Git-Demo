package tring_programs;

import java.util.HashSet;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		String s="samsung app";
		
		char[] ch=s.toCharArray();
		
		HashSet<Character> set=new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		System.out.println(set.toString());
		
		StringBuffer sb=new StringBuffer();
		for (Character character : set) {
			sb.append(character);
			
		}
		System.out.println(sb);
	}
}
