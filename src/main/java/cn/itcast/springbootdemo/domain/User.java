package cn.itcast.springbootdemo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
	private int id;
	private String name;
	private int age;
	private String gentle;
	private Date birthday;
	private Date createTime;
	private Date updateTime;
}
