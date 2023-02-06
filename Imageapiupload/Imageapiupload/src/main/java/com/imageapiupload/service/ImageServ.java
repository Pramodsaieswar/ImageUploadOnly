package com.imageapiupload.service;

import com.imageapiupload.dto.ImageDto;
import org.springframework.web.multipart.MultipartFile;

public interface ImageServ {

//     void storeData(MultipartFile file);
//    public void storeText( String fileName,String description);

    void uploadimage(ImageDto imageDto);

}
