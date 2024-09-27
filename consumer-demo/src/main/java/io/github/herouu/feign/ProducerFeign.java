package io.github.herouu.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "producer-demo")
public interface ProducerFeign {
}
