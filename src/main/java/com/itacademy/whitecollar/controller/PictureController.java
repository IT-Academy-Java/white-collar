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
@RequestMapping("/shops")
public class PictureController {

    @Autowired
    private IPictureRepository iPictureRepository;

    @GetMapping("/pictures")
    @ResponseBody
    public List<PictureResponseDto> getAllPictures() throws Exception{
        return iPictureRepository.findAll();
    }

    @GetMapping("/{id}/pictures")
    @ResponseBody
    public List<PictureResponseDto> getPicturesByShop(@PathVariable(value = "id") Long id) throws Exception{
        return iPictureRepository.findByShopId(id);
    }

    @PostMapping("/{id}/pictures")
    public ResponseEntity<PictureResponseDto> addPicture(
            @PathVariable(value = "id") Long id,
            @RequestBody PictureResponseDto picture
    ) {
        iPictureRepository.create(picture, id);
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }

    @DeleteMapping("/pictures/{id}")
    public ResponseEntity<PictureResponseDto> delete(@PathVariable(value = "id") Long id) {
        PictureResponseDto picture = iPictureRepository.findOne(id);
        iPictureRepository.delete(id);
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }

    @DeleteMapping("/{id}/pictures")
    public ResponseEntity<PictureResponseDto> deletePicturesByShop(@PathVariable(value = "id") Long id) {
        PictureResponseDto picture = iPictureRepository.findOne(id);
        iPictureRepository.deleteByShopId(id);
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }
}

