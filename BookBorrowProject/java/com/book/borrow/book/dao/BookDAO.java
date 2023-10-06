package com.book.borrow.book.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book.borrow.book.dto.BookDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BookDAO {
	
	private final SqlSessionTemplate sqlSessionTemplate;
	
	public List<BookDTO> bookList() throws Exception{
		return this.sqlSessionTemplate.selectList("booktbl.bookList");
	}
}
