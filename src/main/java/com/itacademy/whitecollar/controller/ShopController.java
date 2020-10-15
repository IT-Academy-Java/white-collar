package com.itacademy.whitecollar.controller;

import com.itacademy.whitecollar.dto.ShopResponseDto;
import com.itacademy.whitecollar.repository.IShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
public class ShopController {

    @Autowired
    private IShopRepository iShopRepository;

    @GetMapping("/shops")
    @ResponseBody
    public List<ShopResponseDto> getAllShops() throws Exception{
        return iShopRepository.findAll();
    }

    @PostMapping("/shops")
    public ResponseEntity<ShopResponseDto> save(@RequestBody ShopResponseDto shop) {
        iShopRepository.create(shop);
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }

    @DeleteMapping("/shops/{id}")
    public ResponseEntity<ShopResponseDto> delete(@PathVariable(value = "id") Long id) {
        ShopResponseDto shop = iShopRepository.findOne(id);
        iShopRepository.delete(id);
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }
}
