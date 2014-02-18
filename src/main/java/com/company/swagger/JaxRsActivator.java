/**
 * 
 */
package com.company.swagger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

/**
 * @author joseph.phillips
 * 
 */
@ApplicationPath("/")
public class JaxRsActivator extends Application {
	public JaxRsActivator() {
    	System.out.println("Look at me!");
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion( "1.0.2" );
        beanConfig.setResourcePackage( "com.company.swagger.domain.rest" );
        beanConfig.setBasePath( "http://localhost:9080/api" );
        beanConfig.setDescription( "My RESTful resources" );
        beanConfig.setTitle( "My RESTful API" );
        beanConfig.setScan( true );
        System.out.println("Look at me too!!");
	}
}
