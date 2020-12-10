package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 리스트x
		
		Reader pn = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader userpn = new BufferedReader(pn);
		
		while(true) {
			String data = userpn.readLine();
			if(data == null) {
				break;
			}
			String[] user = data.split(",");
			
			String name = user[0];
			String hp = user[1];
			String company = user[2];
			
			System.out.println("이름:" + name);
			System.out.println("핸드폰:" + hp);
			System.out.println("회사:" + company);
			System.out.println("");
		}
		
		
		pn.close();

	}

}
