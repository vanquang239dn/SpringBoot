package com.example.demo.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "memberId")
public class Book {
	private int bookId;
	private int memberId;
	private String isbnCode;
	private String bookName;
	private String author;
	private int price;
	private Date issueDate;
	private int categoryId;
	private int saleStatusId;

}
