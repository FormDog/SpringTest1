package com.book.borrow.book.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.book.borrow.book.dto.BookDTO;

@Repository
@Mapper
public interface BookMapper {
	List<BookDTO> bookList();
}
