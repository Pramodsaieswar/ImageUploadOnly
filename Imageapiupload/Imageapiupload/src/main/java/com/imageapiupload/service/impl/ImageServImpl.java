package com.imageapiupload.service.impl;

import com.imageapiupload.dto.ImageDto;
import com.imageapiupload.entity.Image;
import com.imageapiupload.repo.ImageRepo;
import com.imageapiupload.service.ImageServ;
import com.imageapiupload.utill.ImageUtill;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;
@Service
public class ImageServImpl implements ImageServ {

    @Autowired
    private ImageRepo imageRepo;

    private ImageDto imageDto;

    ModelMapper modelMapper;

    /*    public void storeData(MultipartFile file) {
            try {
             Image image = new Image();
                if (Optional.ofNullable(imageDto.getData()).isPresent())

                    image.setData(ImageUtill.compressImage(imageDto.getData()));



                //image.setData(file.getBytes());


                imageRepo.save(image);



            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public void storeText( String fileName,String description) {
            Image fileData = new Image();
            fileData.setImagename(fileName);
            fileData.setDescription(description);
            imageRepo.save(fileData);
        }*/
    public void uploadimage(ImageDto imageDto) {
            Image image = new Image();
        if (Optional.ofNullable(imageDto.getFile()).isPresent()) {
            try {
                image.setFile(ImageUtill.compressImage(imageDto.getFile().getBytes()));
                image.setImagename(imageDto.getImagename());
              image.setDescription(imageDto.getDescription());
              image.setId(imageDto.getId());
              imageRepo.save(image);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}