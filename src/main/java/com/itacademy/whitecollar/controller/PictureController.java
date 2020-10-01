package com.itacademy.whitecollar.controller;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import com.itacademy.whitecollar.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", methods= { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
public class PictureController {

    @Autowired
    private IPictureRepository iPictureRepository;

    @GetMapping("/pictures")
    @ResponseBody
    public List<PictureResponseDto> getAllPictures() throws Exception{
        return iPictureRepository.findAll();
    }

}
