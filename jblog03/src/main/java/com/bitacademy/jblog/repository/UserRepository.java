package com.bitacademy.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.UserVo;

@Repository
public class UserRepository {
	
	private SqlSession sqlSession;

	public Boolean insert(UserVo userVo) {
		int count = sqlSession.insert("user.insert", userVo);
		return count == 1;
	}
}
