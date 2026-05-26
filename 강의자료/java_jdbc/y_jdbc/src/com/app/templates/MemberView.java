package com.app.templates;

import com.app.domain.MemberFileVO;
import com.app.domain.MemberVO;
import com.app.enumeration.MemberGender;
import com.app.repository.MemberDAO;

public class MemberView {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		MemberFileVO memberFileVO = new MemberFileVO();
		
//		memberVO.setId(1L);
		memberVO.setMemberEmail("test12@gmail.com");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberName("test");
		memberVO.setMemberAge(3);
		memberVO.setMemberGender(MemberGender.NONE);
//		
//		memberDAO.save(memberVO);
		
		memberFileVO.setFilePath("/user/ubuntu/upload/test.txt");
		memberDAO.save(memberVO, memberFileVO);
		
//		memberVO.setMemberName("홍길동");
//		
//		memberDAO.setMember(memberVO);
		
//		memberDAO.delete(1L);
		
//		memberDAO.setStatus(2L);
		
//		MemberVO member = memberDAO.findById(2L).orElse(new MemberVO());
//		System.out.println(member);
		
//		memberDAO.findAll().forEach(System.out::println);
	}
}













