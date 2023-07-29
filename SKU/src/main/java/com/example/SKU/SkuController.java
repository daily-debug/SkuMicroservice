package com.example.SKU;

import com.example.SKU.model.Sku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SkuController {

    @GetMapping(value = "/getSkuByProduct")
    List<Sku> getSkuByProductId(@RequestParam String id) {
        List<String> skus = Arrays.asList("SKU123", "SKU456");
        List<String> skus1 = Arrays.asList("SKU878", "SKU987");
        Sku sku = new Sku("prod1", skus);
        Sku sku1 = new Sku("prod2", skus1);
        List<Sku> skuList = new ArrayList<>();
        skuList.add(sku);
        skuList.add(sku1);

        List<Sku> result = skuList.stream().filter(p -> p.getProductId().equals(id)).collect(Collectors.toList());
        return result;
    }
}
