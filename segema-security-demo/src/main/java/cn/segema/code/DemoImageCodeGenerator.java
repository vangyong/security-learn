package cn.segema.code;

import org.springframework.web.context.request.ServletWebRequest;

import cn.segema.security.core.validate.code.ValidateCodeGenerator;
import cn.segema.security.core.validate.code.image.ImageCode;


/**
 * @author wangyong
 *
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	@Override
	public ImageCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}

}
