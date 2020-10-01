package com.itacademy.whitecollar.controller;

import com.itacademy.whitecollar.dto.PictureResponseDto;
import com.itacademy.whitecollar.repository.IPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/create")
    public ResponseEntity<PictureResponseDto> save(@RequestBody PictureResponseDto picture) {
        iPictureRepository.create(picture);
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PictureResponseDto> delete(@PathVariable(value = "id") Long id) {
        PictureResponseDto picture = iPictureRepository.findOne(id);
        iPictureRepository.delete(id);
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }
}

