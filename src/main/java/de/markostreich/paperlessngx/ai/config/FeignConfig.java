package de.markostreich.paperlessngx.ai.config;

import de.markostreich.paperlessngx.ai.config.props.PaperlessProperties;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PaperlessProperties.class)
@RequiredArgsConstructor
public class FeignConfig {

    private final PaperlessProperties paperlessProperties;

    @Bean
    public RequestInterceptor authInterceptor() {
        return template -> template.header("Authorization", "Token " + paperlessProperties.getToken());
    }
}
