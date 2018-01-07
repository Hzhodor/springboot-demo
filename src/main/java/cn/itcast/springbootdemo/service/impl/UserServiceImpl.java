package cn.itcast.springbootdemo.service.impl;

import cn.itcast.springbootdemo.dao.UserDao;
import cn.itcast.springbootdemo.domain.User;
import cn.itcast.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public ArrayList<User> userList() {
		return userDao.userList();
	}
}
