package tests;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String[] args) {
		LongestSubstring ls=new LongestSubstring();
		int longest=ls.findLongestSubstringLength("abcabcdebcshdk");
		System.out.println(longest);
		 
	}
	public int findLongestSubstringLength(String s) {
		int l= s.length();
		int maxLength=0;
		int left=0;
		HashSet<Character> set=new HashSet<>();
		for(int right=0; right<l; right++) {
			char currentChar=s.charAt(right);
			while(set.contains(currentChar)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(currentChar);
			maxLength=Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
}

