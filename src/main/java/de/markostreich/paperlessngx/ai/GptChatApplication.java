package de.markostreich.paperlessngx.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "de.markostreich.paperless.client.api")
public class GptChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(GptChatApplication.class, args);
	}

}
