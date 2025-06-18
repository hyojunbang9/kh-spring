package com.zeus.domain;

import java.util.ArrayList;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
//이퀄스, 겟터/셋터, 해시코드, 투스트링이랑
//requireArgsConstructor이 기본인데(이건 nonNull을 썻을 경우!)

@Getter
@Setter
@NoArgsConstructor // 디폴트 생성자
@AllArgsConstructor
@ToString
public class User {
	@NotBlank(message="userID 필수항목!")
	private String userId;
	@NotBlank(message="userNAME 필수항목!")
	private String userName;
	@NotBlank(message="userEMAIL 필수항목!")
	private String email;
	private String userPassword;
	private String introduction;
	private ArrayList<String> checkBoxList;
	private String gender;
	private String nationality;
	

}