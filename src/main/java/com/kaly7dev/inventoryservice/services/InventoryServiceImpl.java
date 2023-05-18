package com.kaly7dev.inventoryservice.services;

import com.kaly7dev.inventoryservice.dtos.InventoryResponse;
import com.kaly7dev.inventoryservice.repositories.InventoryRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepo inventoryRepo;
    @Override
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        return null;
    }
}

