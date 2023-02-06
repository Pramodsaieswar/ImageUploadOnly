package com.imageapiupload.repo;

import com.imageapiupload.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image,Integer> {







}
