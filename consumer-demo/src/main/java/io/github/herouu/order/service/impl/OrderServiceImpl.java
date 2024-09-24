package io.github.herouu.order.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.herouu.order.entity.Order;
import io.github.herouu.order.mapper.OrderMapper;
import io.github.herouu.order.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * 订单业务实现类
 *
 * @author pangu
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {
}
