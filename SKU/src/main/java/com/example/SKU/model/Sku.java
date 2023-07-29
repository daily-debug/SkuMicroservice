package com.example.SKU.model;

import java.util.List;

public class Sku {

    String productId;
    List<String> skuIds;

    public Sku(String productId, List<String> skuIds) {
        this.productId = productId;
        this.skuIds = skuIds;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<String> getSkuIds() {
        return skuIds;
    }

    public void setSkuIds(List<String> skuIds) {
        this.skuIds = skuIds;
    }

}
