package cn.segema.security.core.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import cn.segema.security.core.properties.SecurityConstants;

/**
 * @author wangyong
 *
 */
public class AbstractChannelSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	protected AuthenticationSuccessHandler segemaAuthenticationSuccessHandler;

	@Autowired
	protected AuthenticationFailureHandler segemaAuthenticationFailureHandler;

	protected void applyPasswordAuthenticationConfig(HttpSecurity http) throws Exception {
		http.formLogin().loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
				// .loginPage(SecurityConstants.DEFAULT_LOGIN_PAGE_URL)
				.loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM)
				.successHandler(segemaAuthenticationSuccessHandler).failureHandler(segemaAuthenticationFailureHandler);
	}

}
