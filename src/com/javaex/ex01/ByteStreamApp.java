package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		// 메인
		
		//묶어서 속력 높이기
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		
		byte[] buff = new byte[1024];
		
		//얼만큼 반복할 지 모를 때 사용하는 while
		System.out.println("복사시작");
		while(true) {
			int bData = in.read(buff);
			if(bData == -1) {
				System.out.println("복사끝(쟁반)");
				break;
			}
			
			out.write(buff);
		}
		
		
		
		out.close();
		in.close();
		
		/*
		//추상클래스				본체
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		System.out.println("복사시작");
		//정상적인 경우
		while(true) {
			int bData = in.read();
			
			if(bData == -1) {//데이터의 마지막을 체크
				System.out.println("복사끝");
				break;		 //마지막일 때 반복문 탈출
			}
			out.write(bData);	//데이터가 있으면 사용한다
			
		}
		
		out.close();	//스트림 닫는 것 잊지 말것
		in.close();	//스트림 꼭 닫을 것
		*/
	}

}
