package com.hromenko.carserviceroman.proxies;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="UserServiceRoman", url="localhost:8080")
@Headers("Authorization: {token}")
public interface ServerProxy {
    @GetMapping ("/checkToken")
    public boolean checkToken(@RequestHeader("Authorization") String token);
}
