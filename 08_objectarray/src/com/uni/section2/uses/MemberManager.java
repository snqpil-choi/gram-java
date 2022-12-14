package com.uni.section2.uses;

public class MemberManager {

	public MemberDTO[] signUpMembers() {

		MemberDTO[] members = new MemberDTO[5]; // 5명 등록 가능한 배열 객체 생성
		
		members[0] = new MemberDTO(1, "user01", "pass01", "유재석", 20, '남');
		members[1] = new MemberDTO(2, "user02", "pass02", "남주혁", 30, '남');
		members[2] = new MemberDTO(3, "user03", "pass03", "이효리", 20, '여');
		members[3] = new MemberDTO(4, "user04", "pass04", "로운", 40, '남');
		members[4] = new MemberDTO(5, "user05", "pass05", "이재욱", 20, '남');
		
		MemberInsertManager memberInsertManager = new MemberInsertManager();
		
		memberInsertManager.insert(members); // 회원 등록 안내 메시지 출력 메소드
		
		
		return members;
	}
	
	
	public void printAllMembers(MemberDTO[] mem) {
		for( MemberDTO member : mem) {
			System.out.println(member.getInformation());
		}
		
		System.out.println("========================");
		System.out.println("총 "+ mem.length + "명의 회원이 가입되어 있습니다.");
		
	}

}
