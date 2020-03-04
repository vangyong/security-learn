/**
 * 
 */
package cn.segema.service.impl;

import org.springframework.stereotype.Service;

import cn.segema.service.HelloService;

/**
 * @author vangyong@126.com
 *
 */
@Service
public class HelloServiceImpl implements HelloService {

	/* (non-Javadoc)
	 * @see com.imooc.service.HelloService#greeting(java.lang.String)
	 */
	@Override
	public String greeting(String name) {
		System.out.println("greeting");
		return "hello "+name;
	}

}
