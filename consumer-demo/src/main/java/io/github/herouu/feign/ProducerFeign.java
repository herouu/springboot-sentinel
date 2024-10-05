package io.github.herouu.feign;


import io.github.herouu.api.entity.Order;
import io.github.herouu.entity.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "producer-demo")
public interface ProducerFeign {



    @GetMapping("/order")
    R<List<Order>> getOrder();
}
