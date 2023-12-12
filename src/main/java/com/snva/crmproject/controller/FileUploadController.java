package com.snva.crmproject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.snva.crmproject.service.FileService;



@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/file")
public class FileUploadController {
	
	@Autowired
	private FileService fileService;
    // Define a method to upload files
    @PostMapping("/upload/{id}")
    public ResponseEntity<List<String>> uploadResumeFiles(@PathVariable String id ,@RequestParam("files")List<MultipartFile> multipartFiles) throws IOException {
        List<String> filenames =fileService.uploadFiles(multipartFiles,id,1);
        return ResponseEntity.ok().body(filenames);
    }
    @PostMapping("/uploadFile/{id}")
    public ResponseEntity<List<String>> uploadFiles(@PathVariable String id ,@RequestParam("files")List<MultipartFile> multipartFiles) throws IOException {
        List<String> filenames =fileService.uploadFiles(multipartFiles,id,2);
        return ResponseEntity.ok().body(filenames);
    }
    
    @GetMapping("download/{filename}")
    public ResponseEntity<Resource> downloadFiles(@PathVariable("filename") String filename) throws IOException {
    	return fileService.downloadFiles(filename);
    }

}
