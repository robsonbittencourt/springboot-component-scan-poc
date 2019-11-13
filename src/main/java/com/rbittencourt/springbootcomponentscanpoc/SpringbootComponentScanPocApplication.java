package com.rbittencourt.springbootcomponentscanpoc;

import com.rbittencourt.springbootcomponentscanpoc.config.ComponentScanCustomFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = ComponentScanCustomFilter.class))
public class SpringbootComponentScanPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootComponentScanPocApplication.class, args);
	}

}
