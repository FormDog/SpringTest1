package com.book.borrow.book.dto;

import lombok.Data;

@Data
public class BookDTO {
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private String pdate;
	private String description;
	private int discount;
	private String pic;
}
