package cn.itcast.springbootdemo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@Data
public class User implements Serializable {
	private int id;
	private String name;
	private int age;
	private String gentle;
	private Date birthday;
	private Date createTime;
	private Date updateTime;
}
