package com.book.borrow.book.service;

import java.util.List;

import com.book.borrow.book.dto.BookDTO;

public interface BookService {

	List<BookDTO> bookList() throws Exception;

}
