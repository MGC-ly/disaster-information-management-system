package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DecodeController {
    private DecodeDemo decodeDemo = new DecodeDemo();

    @PostMapping(value = "/code")
    public List<Map<String, Object>> decode(@RequestParam("code") String code) {
        List<Map<String, Object>> decodeInformation = decodeDemo.decode(code);
        return decodeInformation;
    }
}
