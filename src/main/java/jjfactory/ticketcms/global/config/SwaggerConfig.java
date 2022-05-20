package jjfactory.ticketcms.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;
import java.util.List;


@Configuration
@EnableWebMvc
public class SwaggerConfig extends WebMvcConfigurationSupport {


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("GoGoPay_CMS")
                .version("0.0.1")
                .description("Hi \n contextPath = 192.168.0.4/api/gogopay \n \n "
               )
                .build();
    }

//    private Set<String> getConsumeContentTypes() {
//        Set<String> consumes = new HashSet<>();
//        consumes.add("application/json;charset=UTF-8");
//       // consumes.add("application/x-www-form-urlencoded");
//        return consumes;
//    }
//
//    private Set<String> getProduceContentType() {
//        Set<String> produces = new HashSet<>();
//        produces.add("application/json;charset=UTF-8");
//        produces.add("multipart/form-data");
//        return produces;
//    }

    private ApiKey apiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(bearerAuth()).build();
    }

    private List<SecurityReference> bearerAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new SecurityReference("Authorization", authorizationScopes));
    }

    @Bean
    public Docket commonApi() {



        return new Docket(DocumentationType.OAS_30)
                .ignoredParameterTypes(AuthenticationPrincipal.class)
//                .consumes(getConsumeContentTypes())
//                .produces(getProduceContentType())
                .groupName("APP Server")
                .securityContexts(Arrays.asList(securityContext()))
                .securitySchemes(Arrays.asList(apiKey()))
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .build();
    }



}
