package com.book.borrow.book.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.borrow.book.dto.BookDTO;
import com.book.borrow.book.service.BookService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class BookController {
	private final BookService bookService;
	
	@GetMapping("/bookList")
	public ModelAndView bookList() throws Exception{
		ModelAndView mav = new ModelAndView();
		List<BookDTO> list = bookService.bookList();
		mav.addObject("data", list);
		mav.setViewName("/book/bookList");
		return mav;
	}
}
