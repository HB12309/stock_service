package cn.ebing.stock.service.controller;

import cn.ebing.stock.service.api.client.StockClient;
import cn.ebing.stock.service.api.domain.request.StockAddRequest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "股票模块", description = "股票模块相关接口")
@Validated
@RequestMapping("/stocks")
@RestController

/**
 * @author dog
 */
public class StockController implements StockClient {

    @PostMapping("/add")
    @Override
    public void addStock(StockAddRequest request) {

    }
}