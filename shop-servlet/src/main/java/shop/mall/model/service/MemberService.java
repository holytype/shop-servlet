package shop.mall.model.service;

import java.sql.Connection;

import shop.mall.model.dao.MemberDao;
import shop.mall.model.dto.MemberDto;
import shop.mall.model.dto.MemberInfo;
import shop.mall.model.dto.MemberLoginDto;

import static shop.mall.common.jdbc.JdbcTemplate.*;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	//로그인
	public MemberInfo memberLogin(MemberLoginDto dto) {
		MemberInfo result = null;
		Connection conn = getConnection(true);
		result = dao.memberLogin(conn, dto);
		close(conn);
		return result;
	}
	
	//아이디 중복 체크
	public Integer idDuplicateCheck(String mId) {
		Integer result = null;
		Connection conn = getConnection(true);
		result = dao.idDuplicateCheck(conn, mId);
		close(conn);
		return result;
	}
	
	//회원가입 
	public Integer registMember(MemberDto dto) {
		Integer result = null;
		Connection conn = getConnection(true);
		result = dao.registMember(conn, dto);
		close(conn);
		return result;
	}
	

	
}