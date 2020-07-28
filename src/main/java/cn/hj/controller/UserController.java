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
//    文件上传
    @RequestMapping("fileUpload1")
    public String fileUpload1(HttpServletRequest request, MultipartFile upload){
        System.out.println("springmvc文件上传...");

        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        // 判断，该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            // 创建该文件夹
            file.mkdirs();
        }

        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 解析request
        List<FileItem> items = upload.parseRequest(request);
        //遍历
        for(FileItem item:items){
            if(item.isFormField()){
                //说明普通表单项
            }else{
                //说明上传文件项
                // 获取上传文件的名称
                String filename = item.getName();

                //把文件的名称设置成唯一值.uuid
                String uuid = UUID.randomUUID().toString().replace("-","");
                filename = uuid+"_"+filename;


                //完成文件上传
                item.write(new File(path,filename));
                //删除临时文件
                item.delete();
            }
        }





        return "success";
    }
}
