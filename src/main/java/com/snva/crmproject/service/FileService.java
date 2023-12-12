package com.snva.crmproject.service;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	List<String> uploadFiles(List<MultipartFile> multipartFiles,String id,int type) throws IOException;
	ResponseEntity<Resource> downloadFiles(String filename) throws IOException;
}
