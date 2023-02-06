package com.imageapiupload.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Image {
        @Id
     //
        private int id;
        private String imagename;
        private String description;
        @Lob
        private byte[] file;





}
