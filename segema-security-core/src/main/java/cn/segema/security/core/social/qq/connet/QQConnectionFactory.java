/**
 * 
 */
package cn.segema.security.core.social.qq.connet;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;

import cn.segema.security.core.social.qq.api.QQ;

/**
 * @author wangyong
 *
 */
public class QQConnectionFactory extends OAuth2ConnectionFactory<QQ> {

	public QQConnectionFactory(String providerId, String appId, String appSecret) {
		super(providerId, new QQServiceProvider(appId, appSecret), new QQAdapter());
	}

}
