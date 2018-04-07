package org.nirvana;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer
public class EruekaServerApplication {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}