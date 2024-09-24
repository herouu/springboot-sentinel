package io.github.herouu.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Seata用户启动类
 *
 * @author pangu
 */
@FeignClient
@SpringBootApplication
@EnableTransactionManagement
public class SeataUserServer {
	public static void main(String[] args) {
		SpringApplication.run(SeataUserServer.class, args);
	}
}
