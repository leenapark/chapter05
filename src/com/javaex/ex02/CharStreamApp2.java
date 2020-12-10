package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {
		
		//Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");	//파일이 깨짐		
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();	//줄단위로 읽음 readLine()
			if(str == null) {	//줄바꿈 기호는 제외/문자만 읽어옴
				break;
			}
			System.out.println(str);
		}
		
		
		
		fr.close();
	}

}
