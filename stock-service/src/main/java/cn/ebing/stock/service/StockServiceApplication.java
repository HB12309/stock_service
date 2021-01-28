package cn.ebing.center.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockServiceApplication {
    public static void main(String[] args) {
        System.out.println("===== StockServiceApplication 准备启动 =====");
        SpringApplication.run(StockServiceApplication.class, args);
        System.out.println("===== StockServiceApplication 启动完成 =====");
    }
}
