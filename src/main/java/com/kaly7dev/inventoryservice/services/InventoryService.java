package com.kaly7dev.inventoryservice.services;

import com.kaly7dev.inventoryservice.dtos.InventoryResponse;

import java.util.List;

public interface InventoryService {
    List<InventoryResponse> isInStock(List<String> skuCode);
}
