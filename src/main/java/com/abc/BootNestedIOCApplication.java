package com.abc;

import com.abc.bean.LaunchPad;
import com.abc.config.ChildConfig;
import com.abc.config.ParentConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootNestedIOCApplication {

    public static void main(String[] args) {

        SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
        SpringApplication springApplication = applicationBuilder
                .parent(ParentConfig.class)
                .sources(ChildConfig.class)
                .build();

        ApplicationContext context = springApplication.run(args);
        LaunchPad launchPad = context.getBean(LaunchPad.class);
        launchPad.launch();


    }
}
