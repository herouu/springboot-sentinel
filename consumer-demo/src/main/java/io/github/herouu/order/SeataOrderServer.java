package io.github.herouu.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Seata订单启动类
 *
 * @author pangu
 */
@FeignClient
@SpringBootApplication
@EnableTransactionManagement
public class SeataOrderServer {
	public static void main(String[] args) {
		SpringApplication.run(SeataOrderServer.class, args);
	}
}
