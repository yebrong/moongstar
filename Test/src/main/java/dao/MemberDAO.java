package dao;

import dto.Member;

public interface MemberDAO {
	void insertMember(Member member) throws Exception;
	Member selectMember(String id) throws Exception;
}
