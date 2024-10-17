package io.github.herouu.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import io.github.herouu.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@Slf4j
public class SentinelConfig {

    public SentinelConfig() {
        GatewayCallbackManager.setBlockHandler((serverWebExchange, ex) -> {
                    log.info("触发限流！");
                    return ServerResponse.status(HttpStatus.TOO_MANY_REQUESTS)
                            .contentType(MediaType.APPLICATION_JSON)
                            .bodyValue(R.failed(HttpStatus.TOO_MANY_REQUESTS.value(), "限流啦,请求太频繁!"));
                }

        );
    }
}

