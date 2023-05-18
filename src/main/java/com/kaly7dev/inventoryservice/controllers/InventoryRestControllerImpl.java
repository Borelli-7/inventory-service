package com.kaly7dev.inventoryservice.controllers;

import com.kaly7dev.inventoryservice.dtos.InventoryResponse;
import com.kaly7dev.inventoryservice.services.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/inventory")
@RequiredArgsConstructor
public class InventoryRestControllerImpl implements InventoryController {

    private final InventoryService inventoryService;
    @Override
    @GetMapping(params = "skuCode")
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
