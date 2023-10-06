package com.book.borrow.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book.borrow.book.dao.BookDAO;
import com.book.borrow.book.dao.BookMapper;
import com.book.borrow.book.dto.BookDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

	private final BookDAO bookDAO;
	private final BookMapper bookMapper;
	
//	@Override
//	public List<BookDTO> bookList() throws Exception {
//		return bookDAO.bookList();
//	}
	
	@Override
	public List<BookDTO> bookList() throws Exception {
		return bookMapper.bookList();
	}
}
