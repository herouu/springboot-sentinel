package io.github.herouu.order.controller;

import io.github.herouu.api.entity.Order;
import io.github.herouu.entity.R;
import io.github.herouu.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单控制器类
 *
 * @author pangu
 */
@RestController
public class OrderController {

	@Autowired
	private IOrderService orderService;


	@PostMapping("/order")
	public void createOrder() {
		Order order = new Order();
		order.setMoney(100);
		orderService.save(order);
	}


	@GetMapping("/order")
	public R<List<Order>> getOrder() {
		return R.ok(orderService.list());
	}
}
