package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		//메인
		
		ArrayList<Person> pList = new ArrayList<Person>();
		
		Reader pn = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader userpn = new BufferedReader(pn);
		
		while(true) {
			String user = userpn.readLine();
			if(user == null) {
				break;
			}
			String[] data = user.split(",");
			
			Person userph = new Person(data[0], data[1], data[2]);
			Person userme = new Person("박리나", "010-8316-5149", "02-2602-5026");
			pList.add(userph);
			pList.add(userme);
		}
		
		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		}
		
		pn.close();
		
	}

}
