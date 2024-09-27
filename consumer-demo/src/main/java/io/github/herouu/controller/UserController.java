package io.github.herouu.controller;

import io.github.herouu.api.entity.User;
import io.github.herouu.entity.R;
import io.github.herouu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author pangu
 */
@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping("/user")
	public R<Boolean> createUser(@RequestBody User user) {
		userService.saveOrUpdate(user);
		// orderProvider.createOrder();
		return R.ok(Boolean.TRUE);
	}
}
