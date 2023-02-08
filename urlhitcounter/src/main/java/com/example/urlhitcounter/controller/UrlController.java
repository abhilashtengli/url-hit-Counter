package com.example.urlhitcounter.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urlhitcounter.model.UrlModel;
import com.example.urlhitcounter.service.UrlService;

@RestController
@RequestMapping("/Counter")
public class UrlController {
    
    @Autowired
    private UrlService urlService;
    
    @GetMapping("count/userName/{userName}")
    public UrlModel getModel(@PathVariable String userName){
        return urlService.getModel(userName);
    }
    @GetMapping("/allCount")
    public HashMap<String,Integer> getAllCount(){
        return urlService.getAllCounts();
    }
}
