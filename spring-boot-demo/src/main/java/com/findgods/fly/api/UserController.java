package com.findgods.fly.api;

import com.findgods.fly.entity.User;
import com.findgods.fly.repository.UserRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * REVIEW @RestController  注解相当于 @Controller 和 @ResponseBody
 * @Description: restful api
 * @author xiaoxu.huang
 * @date 2017/3/2  10:33
 *
 */
@RestController
public class UserController {

	@Resource
	private UserRepository userRepository;

	@RequestMapping(value = "/user/{username}")
	public String getUserByUsername(@PathVariable String username) {
		userRepository.save(new User(11L, username));
		return "";
	}

}
