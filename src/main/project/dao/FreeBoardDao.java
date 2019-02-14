package dao;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dto.FreeBoard;
import dto.TBoard;
import other.AutoLinePrint;

public class FreeBoardDao {
	private JdbcTemplate jdbcTemplate;
	private String sql;
	
	@Autowired
	public FreeBoardDao(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	//자유게시판 글쓰기
	public Integer insert(FreeBoard freeboard) {
		Integer i = null;
		sql = "insert into FreeBoard(fno,fmno,fsubject,fcontent,fdate)"
			+ " values(fno.nextval,?,?,?,sysdate)";
		
		i= jdbcTemplate.update(sql,freeboard.getfMno(),freeboard.getfSubject(),freeboard.getfContent());
		AutoLinePrint.println("글번호 : "+ freeboard.getfNo() +" 글쓰기 처리 완료");
		return i;
	}
	//자유게시판 리스트
	public ArrayList<FreeBoard> Memberlist(){
		  ArrayList<FreeBoard> list = new ArrayList<FreeBoard>();
		sql ="select * from freeboard";
		
		return list;
		
	}

}
