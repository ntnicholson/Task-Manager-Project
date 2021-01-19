package com.hcl;
//
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.xml.ws.WebEndpoint;
import com.google.common.base.Predicate;
import static com.google.common.base.Predicates.or;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {//extends WebMvcConfigurationSupport {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()                 
                .apis(RequestHandlerSelectors.basePackage("com.hcl"))
                .paths(regex("/task.*"))
                .build();
             
    }
    private Predicate<String> postPaths(){
		return or(regex("/api/posts.*"), regex("/task.*"));
	}
//  @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//	  registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//	  registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
}
