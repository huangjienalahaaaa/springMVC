package cn.hj.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
//    SpringMVC文件上传
    @RequestMapping("fileUpload2")
    public String fileUpload2( MultipartFile upload){

        //定义上传文件服务器路径
        String path = "http://localhost:9090/uploads/"；


         String filename = upload.getOriginalFilename();
         String uuid = UUID.randomUUID().toString().replace("-","");
         filename = uuid+"_"+filename;

        //创建客户端的对象
        Client client = Client.create();

        //和图片服务器进行连接
        WebResource webResource = client.resource(path+filename);

        //上传文件
        webResource.put(upload.getBytes());

        return "success";
    }
}
