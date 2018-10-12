package top.kwseeker.msaweathercollectionserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherCollectionServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherCollectionServerApplication.class, args);
	}
}
