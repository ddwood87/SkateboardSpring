package skate.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import skate.beans.Skateboard;

/**
 * @author dominicwood - ddwood2@dmacc.edu
 * CIS175 - Fall 2022
 * Oct 17, 2022
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Skateboard skateboard() {
		Skateboard bean = new Skateboard();
		return bean;
	}
}
