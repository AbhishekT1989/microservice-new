package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.dto.InventoryResponse;
import com.programmingtechie.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InvetoryController {

    // using path variable "http://localhost:8082/api/inventory/iphone,iphone 12"
    //using requestparam "http://localhost:8082/api/inventory?sku-code=iphone&sku_code=iphone12"
    private final InventoryService inventoryService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<InventoryResponse> iInStock(@RequestParam List<String> skuCode){
      return inventoryService.isInStock(skuCode);
    }
}
