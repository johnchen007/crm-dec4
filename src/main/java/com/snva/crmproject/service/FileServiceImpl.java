package com.snva.crmproject.service;

import static java.nio.file.Files.copy;
import static java.nio.file.Paths.get;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static org.springframework.http.HttpHeaders.CONTENT_DISPOSITION;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileServiceImpl implements FileService {

	@Autowired
	private Environment env;
    public static String DIRECTORY = System.getProperty("user.home") + "/Documents/";
    
	@Override
	public List<String> uploadFiles(List<MultipartFile> multipartFiles,String id,int type) throws IOException {
		List<String> filenames = new ArrayList<>();
        String loc = env.getProperty("location");
        System.out.println(env.getProperty("location"));
        String filename="";
        for(MultipartFile file : multipartFiles) {
        	switch(type) {
        	case 1: filename = id+"_Resume.pdf";break;
        	case 2: filename = id+"_File.pdf";
        	}
           
            System.out.println("Hi");
            Path fileStorage = get(DIRECTORY+loc, filename).toAbsolutePath().normalize();
            copy(file.getInputStream(), fileStorage, REPLACE_EXISTING);
            filenames.add(filename);
        }
        return filenames;
	}

	@Override
	public ResponseEntity<Resource> downloadFiles(String filename) throws IOException {
		String loc = env.getProperty("location");
    	Path filePath = get(DIRECTORY+loc).toAbsolutePath().normalize().resolve(filename);
        if(!Files.exists(filePath)) {
            throw new FileNotFoundException(filename + " was not found on the server");
        }
        Resource resource = new UrlResource(filePath.toUri());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("File-Name", filename);
        httpHeaders.add(CONTENT_DISPOSITION, "attachment;File-Name=" + resource.getFilename());
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(Files.probeContentType(filePath)))
                .headers(httpHeaders).body(resource);
	}

}
