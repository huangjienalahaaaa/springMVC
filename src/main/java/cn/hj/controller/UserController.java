package cn.hj.controller;

//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.WebResource;
//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
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
    public String fileUpload2(HttpServletRequest request, MultipartFile upload){


        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(path);
        if(!file.exists()){
            // 创建该文件夹
            file.mkdirs();
        }



            // 获取上传文件的名称
            String filename = upload.getOriginalFilename();


            String uuid = UUID.randomUUID().toString().replace("-","");
            filename = uuid+"_"+filename;


            //完成文件上传
        upload.transferTo(new File(path,filename));


        return "success";
    }
}
