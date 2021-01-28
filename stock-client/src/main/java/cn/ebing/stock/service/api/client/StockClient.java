package cn.ebing.stock.service.api.client;

import cn.ebing.stock.service.api.domain.request.StockAddRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "stock-service", path = "/stocks")
public interface StockClient {

    /**
     * 新增股票
     * @param request
     */
    @PostMapping("/add")
    void addStock(
        @RequestBody @Validated StockAddRequest request
    );
}
