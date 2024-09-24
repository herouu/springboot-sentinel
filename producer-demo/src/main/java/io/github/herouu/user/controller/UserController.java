package io.github.herouu.user.controller;

import io.github.herouu.common.api.Result;
import io.github.herouu.user.entity.User;
import io.github.herouu.user.feign.OrderProvider;
import io.github.herouu.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author pangu
 */
@RestController
@RequiredArgsConstructor
public class UserController {
	private final IUserService userService;
	private final OrderProvider orderProvider;

	@PostMapping("/user")
	public Result<String> createUser(@RequestBody User user) {
		userService.saveOrUpdate(user);
		orderProvider.createOrder();
		return Result.condition(Boolean.TRUE);
	}
}
