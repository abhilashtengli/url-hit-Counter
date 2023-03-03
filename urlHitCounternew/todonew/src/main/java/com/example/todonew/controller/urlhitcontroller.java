package com.example.todonew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.todonew.service.urlhitservice;



@RestController
@RequestMapping("api/v1/visitor-count-app")
public class urlhitcontroller {
    // private int hitcount=0;
    // @GetMapping("/count")
    // public int hit() {
    //     return ++hitcount;
    //   }
    
  private final urlhitservice hitCounterService;

  public urlhitcontroller(urlhitservice hitCounterService) {
    this.hitCounterService = hitCounterService;
  }
  @GetMapping("/count")
  public int hit() {
    return hitCounterService.hit();
  }

    
}
