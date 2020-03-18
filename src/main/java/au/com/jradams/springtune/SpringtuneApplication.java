package au.com.jradams.springtune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EntityScan("au.com.jradams.springtune.model")
@EnableAutoConfiguration
@EnableMongoRepositories("au.com.jradams.springtune.repository")
@SpringBootApplication(scanBasePackages = "au.com.jradams.springtune")
public class SpringtuneApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringtuneApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringtuneApplication.class, args);
	}
}
