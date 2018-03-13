package com.api.member.model.vo;

public class Member {
	private int memberNo;
	private String memberName;
	private int height;
	private int weight;
	private String birth;
	
	public Member (){}
	
	public Member(int memberNo, String memberName, int height, int weight, String birth){
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}
	
	@Override
	public String toString(){
		
		return memberNo + " , "+ memberName +" , " + height+" , " + weight+ " , " + birth;
	}
	
	
	public void setMemberNo(int memberNo){
		this.memberNo = memberNo;
	}
	public void setMeberName(String memberName){
		this.memberName = memberName;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void setBrith(String birth){
		this.birth = birth;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}

	public String getBirth() {
		return birth;
	}
}
