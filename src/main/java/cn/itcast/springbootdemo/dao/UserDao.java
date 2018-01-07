package cn.itcast.springbootdemo.dao;

import cn.itcast.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserDao {
	ArrayList<User> userList();
}
