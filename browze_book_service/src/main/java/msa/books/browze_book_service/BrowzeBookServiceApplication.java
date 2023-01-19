package msa.books.browze_book_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class BrowzeBookServiceApplication {
	public BrowzeBookServiceApplication(){}

	@Bean
	//pour consommer les services
	@LoadBalanced
	public RestTemplate getRestTemplate() { return new RestTemplate();}
	public static void main(String[] args) {
		SpringApplication.run(BrowzeBookServiceApplication.class, args);
	}

}
