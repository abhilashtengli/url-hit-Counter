package com.example.urlhitcounter.service;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.urlhitcounter.model.UrlModel;

@Service
public class UrlService {

    HashMap<String,Integer> map = new HashMap<>();

    public UrlModel getModel(String userName) {
     int count = map.getOrDefault(userName,0)+1;
     map.put(userName, count);

     UrlModel urlModel = new UrlModel(userName, count);
     return urlModel;
    }

    public HashMap<String, Integer> getAllCounts() {
        return map;
    }
    
}
