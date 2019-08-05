package com.zqxsober.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Component
public class WebAppConfig {
    protected SpringApplicationBuilder config(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(WebAppConfig.class);
    }
}
