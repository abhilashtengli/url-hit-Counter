package com.example.todonew.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;
@Service
public class urlhitservice {

    private AtomicInteger hitCount = new AtomicInteger(0);

    public int hit() {
      return hitCount.incrementAndGet();
    }

//   public int getHitCount() {
//     return hitCount.get();
//   }
}
