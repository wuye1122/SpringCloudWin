package lemon.sell.cloudapigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        //使用final修饰的类 不可以被更改
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration configuration = new CorsConfiguration();
        source.registerCorsConfiguration("/**",configuration);
        return new CorsFilter(source);
    }
}
