package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class PluralsightSpringcloudM5ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM5ZipkinserverApplication.class, args);
	}
}
