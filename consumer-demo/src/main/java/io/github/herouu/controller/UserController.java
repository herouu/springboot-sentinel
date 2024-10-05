package io.github.herouu.controller;

import io.github.herouu.api.entity.Order;
import io.github.herouu.entity.R;
import io.github.herouu.feign.ProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 *
 * @author pangu
 */
@RestController
public class UserController {

    @Autowired
    private ProducerFeign producerFeign;


    @GetMapping("/consumer/order")
    public R<List<Order>> getOrder() {
        return producerFeign.getOrder();
    }
}
