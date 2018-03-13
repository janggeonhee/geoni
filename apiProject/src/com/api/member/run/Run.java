package com.api.member.run;

import com.api.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		String str = "1, 김연아, 165, 46, 19900905";
		String[] infoArr = str.split(", ");
		
		int memberNo= Integer.parseInt(infoArr[0]);
		String memberName= infoArr[1];
		int height= Integer.parseInt(infoArr[2]);
		int weight =Integer.parseInt(infoArr[3]);
		String birth = infoArr[4];
		
		Member member = new Member(memberNo, memberName, height, weight, birth);
		System.out.println(member.toString());
		
		
		
		String data = "1,김연아,165,47,19900905/2,양세형,167,60,19850818/3,김래원,182,80,19810319";
		String[] datas = data.split("/");
		
		
		int memberNo2 = 0;
		String memberName2 = "";
		int height2 =0;
		int weight2 =0;
		String birth2 = " ";		
		
		String[] temp = null;
		
		Member[] memberArr = new Member[datas.length];
		for(int i = 0; i<datas.length; i++){
		temp = datas[i].split(",");
		
		memberNo2 = Integer.parseInt(temp[0]);
		memberName2 = temp[1];
		height2 = Integer.parseInt(temp[2]);
		weight2 = Integer.parseInt(temp[3]);
		birth2 = temp[4];
		
		member = new Member(memberNo2, memberName2, height2, weight2, birth2);
		memberArr[i] = member;
		}
				
		for(int i =0;  i<memberArr.length; i++){
			System.out.println(memberArr[i].toString());
			
		}
		
	}
}
