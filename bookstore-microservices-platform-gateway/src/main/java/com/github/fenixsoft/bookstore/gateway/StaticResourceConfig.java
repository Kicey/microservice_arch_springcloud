package com.github.fenixsoft.bookstore.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author Kicey
 */
@Configuration
public class StaticResourceConfig {
    @Bean
    public RouterFunction<ServerResponse> indexRouter(@Value("classpath:/static/index.html") final Resource indexHtml) {
        return RouterFunctions.route(RequestPredicates.GET("/"), request -> ServerResponse.ok().contentType(MediaType.TEXT_HTML).bodyValue(indexHtml));
    }

    @Bean
    RouterFunction<ServerResponse> staticResourceRouter(){
        return RouterFunctions.resources("/**", new ClassPathResource("static/"));
    }
}
