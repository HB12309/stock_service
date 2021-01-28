package cn.ebing.stock.service.api.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients("cn.ebing.stock.service.api.client")
public class StockServiceAutoConfiguration {}
