package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author zwh
 * @create 2023/02/12
 */
public class FileController {
  /**
   * 默认定位到的当前用户目录("user.dir")（即工程根目录）
   * JVM就可以据"user.dir" + "你自己设置的目录" 得到完整的路径（即绝对路径）
   */
  @PostMapping("/upload")
  public String String (MultipartFile file, HttpServletRequest request) throws Exception {
    System.out.println("文件大小："+file.getSize());
    System.out.println("文件的contentTYpe:"+file.getContentType());
    System.out.println("文件的初始名字："+file.getOriginalFilename());

    String path = request.getServletContext().getRealPath("/upload");
    System.out.println("获取web服务器的运行目录："+path);
    saveFile(file,path);
    return "upload success!";
  }
  public void saveFile(MultipartFile f,String path) throws IOException{
    File upDir = new File(path);
    if (!upDir.exists()){
      upDir.mkdir();
    }
    File file = new File(path+f.getOriginalFilename());
    f.transferTo(file);
  }
}
