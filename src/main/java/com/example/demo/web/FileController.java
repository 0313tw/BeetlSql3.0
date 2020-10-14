package com.example.demo.web;

import com.example.demo.entity.Attachment;
import com.example.demo.mapper.FileMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: 陈艺博
 * Date:  2020-10-14 15:12
 * Description:
 */
@Slf4j
@RestController
public class FileController {

    @PostMapping("/file")
    public Attachment add(Attachment attachment) {
        fileService.insert(attachment);
        return get(attachment.getId());
    }

    @GetMapping("/file/{id}")
    public Attachment get(@PathVariable("id") Integer id) {
        return fileService.single(id);
    }

    @Resource
    private FileMapper fileService;
}
