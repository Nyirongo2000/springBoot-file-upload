package com.imageupload.example.imageUpload.services;

import com.imageupload.example.imageUpload.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAtachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;
}
