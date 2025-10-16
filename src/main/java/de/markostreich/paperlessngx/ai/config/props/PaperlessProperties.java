package de.markostreich.paperlessngx.ai.config.props;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "paperless")
@RequiredArgsConstructor
@Getter
public class PaperlessProperties {
    private final String url;
    private final String token;
}
