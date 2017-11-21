package springMVC_file_up_load;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("upload")
public class file_up_load {
	@RequestMapping("toFileUploadPage")
	public String upload(){
		return "springMVC_file_up_load";
	}
	
	@RequestMapping("fileupload")
	public String upload(String desc, MultipartFile file) throws IllegalStateException,IOException{
		if(!file.isEmpty()){
			System.out.println("desc");
			file.transferTo(new File("f:\\temp/"+file.getOriginalFilename()));
		}
		return "success";
	}
}
