package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = "memberId")
public class Member {
	private int memberId;
	private String loginID;
	private String password;
	private String lastName;
	private String firstName;
	private String zipcode;
	private String prefecture;
	private String address;
	private String email;
	private String phoneNumber;

}
