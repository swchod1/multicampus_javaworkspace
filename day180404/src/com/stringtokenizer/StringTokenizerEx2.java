package com.stringtokenizer;


import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "나/보기가/역겨워/가실때에는/말없이/고이";
		
		StringTokenizer tokens = new StringTokenizer(str, "/"); //StringTokenizer -> 만든거 아님 원래 있는거
		
		for(int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.print("문자 " + x + " : " + tokens.nextToken()+"\t");
		}
		System.out.println();
		System.out.println("=======================================");
		
		
		/////////////////////////////////////
		
		String[] values = str.split("/");
		
		
		for(int i = 0; i < values.length; i++) {
			System.out.print("문자 " + (i+1) + " : " + values[i]+"\t");
		}
		System.out.println();
		System.out.println("=======================================");

	}

}
