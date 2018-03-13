package io.test;

import java.util.Scanner;

import io.silsub1.Mynote;

public class TestMyNote {
	
	public static void main(String[] args) {
		
		
		TestMyNote.menu();
		
	}
	
	public static void menu(){
		Mynote mn = new Mynote();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
		while(num != 4){
			System.out.println("******** MyNote ********");
			System.out.println();
			System.out.println("1. 노트 새로 만들기 ");
			System.out.println("2. 노트 열기 ");
			System.out.println("3. 노트 열어서 수정하기 ");
			System.out.println("4. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택 : ");
			num = sc.nextInt();
			
			
			switch(num){
			case 1:
				mn.fileSave();
				break;
			case 2:
				mn.fileOpen();
				break;
			case 3:
				mn.fileEdit();
				break;
			case 4:
				System.out.println("프로그램 종료 ");
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
	}
}
