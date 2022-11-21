package com.example.bmgl;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Map;

@CrossOrigin("*")
@RestController
public class DecodeController {

    private DecodeDemo decodeDemo = new DecodeDemo();

    @RequestMapping(value = "/decode")
    public List<Map<String, Object>> decode(String code) {
        List<Map<String, Object>> decodeInformation = decodeDemo.decode(code);
        return decodeInformation;
    }


//    @PostMapping(value = "/code")
//    public List<Map<String, Object>> decode(@RequestParam("code") String code) {
//        List<Map<String, Object>> decodeInformation = decodeDemo.decode(code);
//        return decodeInformation;
//    }


    //SON形式返回给结果
    @ResponseBody
    //文件只能用POST方式进行传递
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String filesUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "false";
        }
        String fileName = file.getOriginalFilename();
        File dest = new File(  "/Users/ly/Desktop/" + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest); // 保存文件
            return "true";
        } catch (Exception e) {
            e.printStackTrace();
            return "false";
        }
    }
}
