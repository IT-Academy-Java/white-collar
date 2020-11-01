package com.itacademy.whitecollar.controller;

import com.itacademy.whitecollar.dto.ShopResponseDto;
import com.itacademy.whitecollar.service.impl.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping("/shops")
public class ShopController {

    @Autowired
    private ShopServiceImpl shopService;

    @GetMapping("/")
    @ResponseBody
    public List<ShopResponseDto> getAllShops() throws Exception{
        return shopService.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<ShopResponseDto> save(@RequestBody ShopResponseDto shop) {
        shopService.create(shop);
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ShopResponseDto> delete(@PathVariable(value = "id") Long id) {
        ShopResponseDto shop = shopService.findOne(id);
        shopService.delete(id);
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }
}
