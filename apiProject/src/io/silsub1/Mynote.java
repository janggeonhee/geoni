package io.silsub1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mynote {
	Scanner sc = new Scanner(System.in);

	public Mynote(){	
	}
	
	public void fileSave(){
		StringBuilder str = new StringBuilder();
		char save = ' ';
		String fileName = "";
		String value = null;
		System.out.println("파일에 저장할 내용을 입력하시오.");
		while(true){
		value = sc.nextLine();
		if(value.equals("exit")){
			break;
		}
		str.append(value+"\n");
//		!str.equals("exit")
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		save = sc.next().charAt(0);
		if(save == 'y' || save == 'Y'){
			System.out.print("저장할 파일명 입력 : ");
			sc.nextLine();
			fileName = sc.nextLine();
			
			try(FileWriter fw = new FileWriter(fileName+ ".txt");){
				fw.write(str.toString());
				System.out.println(fileName+".txt 파일에 성공적으로 저장하였습니다.");
			
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
	
	public void fileOpen(){
		String readFile = null;
		
		System.out.print("열기할 파일명 : ");
		readFile = sc.nextLine();
		
		try(FileReader fr = new FileReader(readFile);
				BufferedReader br = new BufferedReader(fr)){
			
		String temp = null;	
			while((temp = br.readLine()) != null){
				System.out.println(temp);
			}
			System.out.println("****다 불러왔습니다.*****");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public void fileEdit(){
		System.out.print("수정할 파일명 : ");
		String editFile = sc.nextLine();
		
		StringBuilder fileCountent = new StringBuilder();
		String temp = "";
		
		try(FileReader fr = new FileReader(editFile);
				BufferedReader br = new BufferedReader(fr);
						FileWriter fw = new FileWriter(editFile,true)){
//			while((temp = br.readLine()) != null){
//				fileCountent.append(temp + "\n"); 
//			}
//		
			System.out.print("수정할 내용 입력 : ");
			while(true){
				temp = sc.nextLine();
				if(temp.equals("exit")){
					break;
				}
				fileCountent.append(temp+"\n");
			}
			
			System.out.print("저장하시겠습니까? (y/n) : ");
			char save = sc.next().charAt(0);
			if(save == 'y' || save == 'Y'){
				fw.write(fileCountent.toString());
				System.out.println(editFile + "이 내용이 변경 되었습니다.");
			}
		}catch(FileNotFoundException fnfe){
			System.out.println("찾으신 파일이  없습니다");
		}catch(IOException ioe){
			System.out.println("입출력 에러");
		}		
	}
	
}
