package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DataInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] configFiles = {DataConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] mappings = {"/"};
		return mappings;
	}

}
