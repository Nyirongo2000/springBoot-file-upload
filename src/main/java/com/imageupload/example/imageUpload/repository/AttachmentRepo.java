package com.imageupload.example.imageUpload.repository;

import com.imageupload.example.imageUpload.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepo extends JpaRepository <Attachment,String > {


}
