package com.itacademy.whitecollar.controller;

import com.itacademy.whitecollar.dto.ShopResponseDto;
import com.itacademy.whitecollar.repository.IShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
