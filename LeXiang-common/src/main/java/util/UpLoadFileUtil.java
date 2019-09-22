package util;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class UpLoadFileUtil {

	/** <pre>uploadFile(文件上传)   
	 * 创建人：梁国栋 634369607@qq.com     
	 * 创建时间：2018-5-14 下午4:08:40    
	 * 修改人：梁国栋 634369607@qq.com   
	 * 修改人电话：18810939871 
	 * 修改时间：2018-5-14 下午4:08:40    
	 * 修改备注： 
	 * @param comm
	 * @param request
	 * @param fileFolder	设置文件存放的文件夹名称
	 * @return</pre>    
	 */
	public static String uploadFile(MultipartFile comm, HttpServletRequest request, String fileFolder){
		//获取文件名称
		String fileName = comm.getOriginalFilename();
		//获取要存放图片的路径
		String realPath = request.getSession().getServletContext().getRealPath(fileFolder);
		//判断是否有次文件夹  没有则需要创建
		File file = new File(realPath);
		
		if(!file.exists()){
			file.mkdir();
		}
		
		//保证文件名称的唯一性
		long timeMillis = System.currentTimeMillis();
		String newFileName = timeMillis+"_"+fileName;
		
		//转存文件
		try {
			comm.transferTo(new File(realPath+"/"+newFileName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return newFileName;
	}
	
	/** <pre>downFile(文件下载)   
	 * 创建人：梁国栋 634369607@qq.com     
	 * 创建时间：2018-5-14 下午4:19:46    
	 * 修改人：梁国栋 634369607@qq.com   
	 * 修改人电话：18810939871 
	 * 修改时间：2018-5-14 下午4:19:46    
	 * 修改备注： 
	 * @param fileFolder 对应文件存放的文件夹名称
	 * @param fileName	  文件名称
	 * @param request	 request对象
	 * @return</pre>    
	 */
	public static ResponseEntity<byte[]> downFile(String fileFolder, String fileName, HttpServletRequest request){
		//定义响应信息
		HttpHeaders httpHeaders=new HttpHeaders();
		//其他的一些变量名 对应一些 文件 类型格式   APPLICATION_OCTET_STREAM 代表所有的文件类型 
		//设置下载的文件类型
		httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		//设置下载的文件名
		httpHeaders.setContentDispositionFormData("attachment",fileName);
		//获得文件保存的绝对路径 /upImg/文件名
		String path=request.getSession().getServletContext().getRealPath(fileFolder);
		//将文件转为二进制数组
		byte[] file = null;
		try {
			//1513231454483_2222.jpg
			file = FileUtils.readFileToByteArray(new File(path+"/"+fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//返回响应信息实体
		return new ResponseEntity<byte[]>(file,httpHeaders,HttpStatus.CREATED);
	}
}
