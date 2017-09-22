package com.piger.jspider;

import com.piger.jspider.model.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by pigercc.liang on 2017/5/21.
 */
@SpringBootApplication
@ConfigurationProperties("application.properties")
@EnableAutoConfiguration
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class,args);
    }
}
