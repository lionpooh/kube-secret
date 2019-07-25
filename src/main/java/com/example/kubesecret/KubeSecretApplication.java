package com.example.kubesecret;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KubeSecretProperties.class)
public class KubeSecretApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(KubeSecretApplication.class);
	
	@Autowired
	private KubeSecretProperties properties;
	
	public static void main(String[] args) {
		SpringApplication.run(KubeSecretApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("application.properties -> kube.name - {} | kube.password - {}", 
				properties.getName(), 
				properties.getPassword());
	}
	
}
