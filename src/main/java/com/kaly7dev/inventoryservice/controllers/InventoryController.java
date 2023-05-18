package com.kaly7dev.inventoryservice.controllers;

import com.kaly7dev.inventoryservice.dtos.*;

import java.util.List;

public interface InventoryController {
    List<InventoryResponse> isInStock(List<String> skuCode);
}
