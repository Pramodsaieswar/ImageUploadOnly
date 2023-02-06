package com.imageapiupload.controller;

import com.imageapiupload.dto.ImageDto;
import com.imageapiupload.entity.Image;
import com.imageapiupload.repo.ImageRepo;
import com.imageapiupload.service.ImageServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
@RequestMapping("/imageapi")
public class ImageCtrl {
@Autowired
    ImageRepo imageRepo;
    @Autowired
    ImageServ imageServ;

//    @PostMapping("/upload")
//    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file,
//                                    @RequestParam(value = "description", required = false) String text,
//                                    @RequestParam(value = "name", required = false) String name
//                                    ){
//        if (file != null ) {
//            imageServ.storeData(file);
//        } else if (text != null && name != null) {
//            imageServ.storeText(name,text);
//        }
//        return null;
//    }

    @PostMapping(value = "/upload",
            consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE} )
    public void uploadFilesExample7(ImageDto imageDto) {
        ImageDto image = new ImageDto();
        image.setId(imageDto.getId());
        image.setFile(imageDto.getFile());
        image.setImagename(imageDto.getImagename());
        image.setDescription(imageDto.getDescription());
        imageServ.uploadimage(image);
    }







}





