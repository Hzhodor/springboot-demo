package cn.itcast.springbootdemo.controller;

import cn.itcast.springbootdemo.domain.User;
import cn.itcast.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "users", method = RequestMethod.POST)
	public ArrayList<User> userList() {
		return userService.userList();
	}

	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping(value = "test", method = RequestMethod.POST)
	public String hottest() {
		return "testsdgdsgd";
	}

	@RequestMapping(value = "lists", method = RequestMethod.POST)
	public List<User> lists() {
		List<User> lists = new ArrayList<>();
		User user = new User();
		user.setName("关之琳");
		user.setAge(20);
		user.setGentle("女");
		lists.add(user);

		User user1 = new User();
		user1.setName("迪丽热巴");
		user1.setGentle("女");
		user1.setAge(18);
		lists.add(user1);

		return lists;
	}

	@RequestMapping(value = "maps", method = RequestMethod.POST)
	public Map<String, Object> maps() {
		Map<String, Object> maps = new HashMap<>();
		maps.put("name", "佟丽娅");
		maps.put("民族", "维吾尔族");
		maps.put("年龄", 28);
		return maps;
	}
}
