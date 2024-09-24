package io.github.herouu.order.controller;

import io.github.herouu.order.entity.Order;
import io.github.herouu.order.service.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单控制器类
 *
 * @author pangu
 */
@RestController
@RequiredArgsConstructor
public class OrderController {
	private final IOrderService orderService;

	@Transactional(rollbackFor = Exception.class)
	@PostMapping("/order")
	public void createOrder() {
		Order order = new Order();
		order.setMoney(100);
		orderService.save(order);
	}
}
